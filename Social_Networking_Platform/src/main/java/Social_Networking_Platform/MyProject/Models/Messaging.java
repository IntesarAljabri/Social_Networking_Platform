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
    int message_id;


    @ManyToOne
    @JoinColumn(name = "sender_id")
    Users sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    Users receiver;


    String messageText;
}
