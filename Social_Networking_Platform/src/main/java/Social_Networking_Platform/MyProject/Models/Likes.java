package Social_Networking_Platform.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "likes")
public class Likes {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int like_id;


    @ManyToOne
    @JoinColumn(name = "post_id")
    Posts post;
}
