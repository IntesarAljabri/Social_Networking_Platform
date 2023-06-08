package Social_Networking_Platform.MyProject.Repository;

import Social_Networking_Platform.MyProject.Models.Comments;
import Social_Networking_Platform.MyProject.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
