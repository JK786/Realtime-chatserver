package com.chatserver.chatroom;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;


@Table(name = "chatroom")
@AllArgsConstructor
@Builder(toBuilder = true)
public class ChatroomDAO {

    @Id
    private String id;

    private String chatroomName;

    private String username;
}
