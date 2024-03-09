package com.chatserver.controllers;

import com.chatserver.ChatMessage;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class ChatController {

    @MessageMapping("/app/sendMessage") //message incoming this will come to this method
    @SendTo("/topic/public") //response will be sent to this topic
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        log.info("Message sent to topic" + chatMessage.toString());

        return ChatMessage.builder().message("Receieved the message").build();
    }

//    @MessageMapping("/chat.addUser")
//    @SendTo("/topic/public")
//    public ChatMessage addUser(ChatMessage chatMessage) {
//        return chatMessage;
//    }

}
