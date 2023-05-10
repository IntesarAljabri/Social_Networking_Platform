package Social_Networking_Platform.MyProject.Controller;
import Social_Networking_Platform.MyProject.Models.Events;
import Social_Networking_Platform.MyProject.Models.Followers;
import Social_Networking_Platform.MyProject.Service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("events")
public class EventsControllers {


    @Autowired
    EventsService eventsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Events> getAllEvents() {
        return eventsService.getAllEvents();
    }
}
