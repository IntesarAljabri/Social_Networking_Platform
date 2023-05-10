package Social_Networking_Platform.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "followers")
public class Followers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int follower_id;

    String nickName;


    @ManyToOne
    @JoinColumn(name = "user_id")
    Users user;
}
