package Social_Networking_Platform.MyProject.Controller;
import Social_Networking_Platform.MyProject.Models.Messaging;
import Social_Networking_Platform.MyProject.Service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessagingControllers {

    @Autowired
    MessagingService messagingService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Messaging> getAllMessage() {

        return messagingService.getAllMessage();
    }
}
