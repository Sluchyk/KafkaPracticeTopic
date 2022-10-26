package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = Constants.TOPIC_NAME,
            groupId = Constants.GROUP_ID)
    public void consume(String message) {
        System.out.println("Topic 1: " + message);
    }
}
