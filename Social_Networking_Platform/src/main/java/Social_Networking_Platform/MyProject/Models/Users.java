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
    int userId;
    String userNickName;

    @OneToMany
    //@JoinColumn(name = "postId")
    List<Posts> posts;

    @OneToMany
    //@JoinColumn(name = "commentsId")
    List<Comments> comments;

    @OneToMany
    //@JoinColumn(name = "followerId")
    List<Followers>followers;

    @OneToMany
   // @JoinColumn(name = "notificationId")
    List<Notifications> notifications;
}
