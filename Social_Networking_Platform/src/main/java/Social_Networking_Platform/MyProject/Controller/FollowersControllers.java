package Social_Networking_Platform.MyProject.Controller;
import Social_Networking_Platform.MyProject.Models.Followers;
import Social_Networking_Platform.MyProject.Service.FollowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("followers")
public class FollowersControllers {

    @Autowired
    FollowersService followersService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Followers> getAllFollowers() {
        return followersService.getAllFollowers();
    }
}
