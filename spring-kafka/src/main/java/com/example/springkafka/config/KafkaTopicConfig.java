package com.example.springkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic susTopic(){
        return TopicBuilder.name("sus")
                //.partitions(10)
                .build();
    }

    @Bean
    public NewTopic susJsonTopic(){
        return TopicBuilder.name("json_sus")
                //.partitions(10)
                .build();
    }
}
