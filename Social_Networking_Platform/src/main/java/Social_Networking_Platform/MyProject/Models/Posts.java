package Social_Networking_Platform.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "posts")
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int post_id;

    String postType;


    @ManyToOne
    @JoinColumn(name = "user_id")
    Users user;
}
