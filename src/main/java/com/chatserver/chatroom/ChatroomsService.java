package com.chatserver.chatroom;

import org.springframework.stereotype.Component;

@Component
public class ChatroomsService {

    public void createChatroom(String chatroomName) {
        // create chatroom
    }

    public void deleteChatroom(String chatroomName) {
        // delete chatroom
    }

    public void joinChatroom(String chatroomName, String username) {
        // join chatroom
    }

    public void leaveChatroom(String chatroomName, String username) {
        // leave chatroom
    }

    public void sendMessage(String chatroomName, String username, String message) {
        // send message
    }

    public void getChatroomMessages(String chatroomName) {
        // get chatroom messages
    }

    public void getChatroomUsers(String chatroomName) {
        // get chatroom users
    }

}
