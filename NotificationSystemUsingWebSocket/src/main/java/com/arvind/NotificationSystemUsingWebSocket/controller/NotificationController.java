package com.arvind.NotificationSystemUsingWebSocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotificationController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications") // It tells where this message need to send
    public String sendMessage(String message) {
        System.out.println("Message received: " + message);
        return message;
    }
}
