package com.chatserver;

import lombok.Builder;


@Builder(toBuilder = true)
public class ChatMessage {
    private String message;
}
