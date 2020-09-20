package com.kafka.springbootwithkafka.kafka;

import org.apache.kafka.common.internals.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    private static final String Topic = "test_topic";

    public void sendMessage(String message){
        this.kafkaTemplate.send(Topic,message);
    }
}
