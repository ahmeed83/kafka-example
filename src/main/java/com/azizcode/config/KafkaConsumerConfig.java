package com.azizcode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

@Configuration
public class KafkaConsumerConfig
{
    private final KafkaConfig kafkaConfig;

    public KafkaConsumerConfig(final KafkaConfig kafkaConfig)
    {
        this.kafkaConfig = kafkaConfig;
    }

    @Bean
    public ConsumerFactory<String, String> consumerFactory()
    {
        return new DefaultKafkaConsumerFactory<>(kafkaConfig.kafkaConsumerConfigBean());
    }

    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory(
            ConsumerFactory<String, String> consumerFactory)
    {
        ConcurrentKafkaListenerContainerFactory<String, String> containerFactory = new ConcurrentKafkaListenerContainerFactory<>();
        containerFactory.setConsumerFactory(consumerFactory);
        return containerFactory;
    }

}
