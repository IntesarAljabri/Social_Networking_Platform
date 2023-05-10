package Social_Networking_Platform.MyProject.Controller;
import Social_Networking_Platform.MyProject.Models.Groups;
import Social_Networking_Platform.MyProject.Service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("groups")
public class GroupsControllers {

    @Autowired
    GroupsService groupsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Groups> getAllGroups() {
        return groupsService.getAllGroups();
    }
}
