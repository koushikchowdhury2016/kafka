package com.dragonslayer.kafkasandbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListeners {

    @KafkaListener(
            topics = "dragonslayer",
            groupId = "groupId"
    )
    void listener(String data) {
        log.info("listener received: " + data + ":)");
    }
}
