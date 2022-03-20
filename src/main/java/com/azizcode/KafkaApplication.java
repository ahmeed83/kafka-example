package com.azizcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(KafkaApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<Person, String> kafkaTemplate)
//    {
//        return args -> {
//            kafkaTemplate.send("azizCode", "Hello Kafka");
//        };
//    }
}