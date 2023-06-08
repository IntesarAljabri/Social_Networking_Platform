package Social_Networking_Platform.MyProject.Service;

import Social_Networking_Platform.MyProject.Models.Messaging;
import Social_Networking_Platform.MyProject.Repository.MessagingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessagingService {
    @Autowired
    MessagingRepository messagingRepository;

    public List<Messaging> getAllMessage() {
        return messagingRepository.findAll();
    }
}
