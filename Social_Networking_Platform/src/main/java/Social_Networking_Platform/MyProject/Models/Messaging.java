package Social_Networking_Platform.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "messages")
public class Messaging {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int messageId;


    @ManyToOne
    @JoinColumn(name = "senderId")
    Users sender;

    @ManyToOne
    @JoinColumn(name = "receiverId")
    Users receiver;


    String messageText;
}
