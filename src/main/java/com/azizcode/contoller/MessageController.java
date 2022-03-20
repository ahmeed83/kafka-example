package com.azizcode.contoller;

import com.azizcode.model.Person;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
public class MessageController
{
    private final KafkaTemplate<Person, String> kafkaTemplate;

    public MessageController(final KafkaTemplate<Person, String> kafkaTemplate)
    {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void publish(@RequestBody Person request)
    {
        kafkaTemplate.send("azizCode", request.toString());
    }
}
