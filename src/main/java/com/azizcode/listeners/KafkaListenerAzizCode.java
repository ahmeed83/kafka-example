package com.azizcode.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerAzizCode
{

    @KafkaListener(topics = "azizCode", groupId = "groupId")
    void listener(String data)
    {
        System.out.println("Listener received: " + data);
    }
}
