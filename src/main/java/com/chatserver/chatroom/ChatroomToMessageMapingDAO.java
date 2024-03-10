package com.chatserver.chatroom;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.data.annotation.Id;


@Table(name = "chatroom_to_message_mapping")
@AllArgsConstructor
@Builder(toBuilder = true)
public class ChatroomToMessageMapingDAO {

    @Id
    private String id;

    private String chatroomRoomId;

    private String messageId;

    private String sender;


}
