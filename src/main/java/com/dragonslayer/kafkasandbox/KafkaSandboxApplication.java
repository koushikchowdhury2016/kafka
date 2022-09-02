package com.dragonslayer.kafkasandbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@Slf4j
public class KafkaSandboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSandboxApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            for (int i = 0; i < 100; i++) {
                kafkaTemplate.send("dragonslayer", "Hello Kafka :)" + i);
            }
        };
    }

}
