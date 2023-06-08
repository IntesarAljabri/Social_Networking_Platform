package Social_Networking_Platform.MyProject.Service;

import Social_Networking_Platform.MyProject.Models.Events;
import Social_Networking_Platform.MyProject.Repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {

    @Autowired
    EventsRepository eventsRepository;

    public List<Events> getAllEvents() {
        return eventsRepository.findAll();
    }
}
