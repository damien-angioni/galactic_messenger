package project.galactic_messenger.model;
import lombok.Getter;
import lombok.Setter;
public class ChatMessage {
    @Getter
    @Setter
    private String content;
    @Getter
    @Setter
    private String sender;
    @Getter
    @Setter
    private MessageType type;
    @Getter
    @Setter
    private String time;

    public enum MessageType{
        CHAT, //for normal chat
        JOIN, //when a user joins the chat
        LEAVE //when a user leaves the chat
    }
}