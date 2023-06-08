package Social_Networking_Platform.MyProject.Repository;

import Social_Networking_Platform.MyProject.Models.Events;
import Social_Networking_Platform.MyProject.Models.Messaging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagingRepository extends JpaRepository<Messaging, Integer> {
}
