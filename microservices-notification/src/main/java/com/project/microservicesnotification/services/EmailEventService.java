
package com.project.microservicesnotification.services;

import com.project.microservicesnotification.events.UserRegisteredEvent;
import com.project.microservicesnotification.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailEventService {

    @Autowired
    private EmailSenderService emailSenderService;

    @KafkaListener(topics = "emails-topic")
    public void consumer(String message) {
        UserRegisteredEvent userRegistered = JsonUtils.fromJson(message, UserRegisteredEvent.class);
        log.info("Received user mail: {}", userRegistered.getData());
        //Todo: Add method to send email
        emailSenderService.sendEmail(userRegistered.getData());
    }
}
