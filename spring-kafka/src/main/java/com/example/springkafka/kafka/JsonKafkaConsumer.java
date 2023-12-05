package com.example.springkafka.kafka;

import com.example.springkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private  static  final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics= "json_sus", groupId = "groupSus")
    public  void consume(User user){
        LOGGER.info(String.format("Json Message Received -> %s", user.toString()));
    }
}
