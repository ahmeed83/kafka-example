package com.azizcode.config;

import com.azizcode.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaProducerConfig
{
    private final KafkaConfig kafkaConfig;

    public KafkaProducerConfig(final KafkaConfig kafkaConfig)
    {
        this.kafkaConfig = kafkaConfig;
    }

    @Bean
    public KafkaTemplate<Person, String> kafkaTemplate(
            ProducerFactory<Person, String> producerFactory)
    {
        return new KafkaTemplate<>(producerFactory);
    }
    
    @Bean
    public ProducerFactory<Person, String> producerFactory()
    {
        return new DefaultKafkaProducerFactory<>(kafkaConfig.kafkaProducerConfigBean());
    }
}
