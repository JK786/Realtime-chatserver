package com.chatserver.controllers;

import com.chatserver.chatroom.ChatroomsService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatroomController {

    private ChatroomsService chatroomsService;

    @PostMapping("/createChatroom")
    public void createChatroom(String chatroomName) {
        chatroomsService.createChatroom(chatroomName);
    }

}

