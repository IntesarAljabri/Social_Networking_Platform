package Social_Networking_Platform.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int user_id;
    String userNickName;

    @OneToMany
    //@JoinColumn(name = "post_id")
    List<Posts> posts;

    @OneToMany
    //@JoinColumn(name = "comments_id")
    List<Comments> comments;

    @OneToMany
    //@JoinColumn(name = "follower_id")
    List<Followers>followers;

    @OneToMany
   // @JoinColumn(name = "notification_id")
    List<Notifications> notifications;
}
