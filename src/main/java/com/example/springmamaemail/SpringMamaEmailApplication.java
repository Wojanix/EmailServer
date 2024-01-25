package com.example.springmamaemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringMamaEmailApplication {
    @Autowired
    private EmailSender senderService;

    public static void main(String[] args) {
        SpringApplication.run(SpringMamaEmailApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendMail(){
        senderService.sendEmail("wojtek.burek@gmail.com", "TestBackEnd", "To jest test backend 25 stycznia");
    }

}
