package Social_Networking_Platform.MyProject.Controller;
import Social_Networking_Platform.MyProject.Models.Notifications;
import Social_Networking_Platform.MyProject.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationsControllers {

    @Autowired
    NotificationService notificationsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Notifications> getAllNotifications() {

        return notificationsService.getAllNotification();
    }
}
