package Social_Networking_Platform.MyProject.Service;

import Social_Networking_Platform.MyProject.Models.Notifications;
import Social_Networking_Platform.MyProject.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    public List<Notifications> getAllNotification() {
        return notificationRepository.findAll();
    }
}
