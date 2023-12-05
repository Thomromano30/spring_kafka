package com.example.springkafka.controller;

import com.example.springkafka.kafka.JsonKafkaProducer;
import com.example.springkafka.payload.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//("localhost:9093")
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){

        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message sent to kafka topic");

    }
}
