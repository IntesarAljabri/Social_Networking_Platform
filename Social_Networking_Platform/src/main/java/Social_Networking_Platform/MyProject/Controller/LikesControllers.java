package Social_Networking_Platform.MyProject.Controller;
import Social_Networking_Platform.MyProject.Models.Likes;
import Social_Networking_Platform.MyProject.Service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LikesControllers {

    @Autowired
    LikesService likesService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Likes> getAllLikes() {
        return likesService.getAllLikes();
    }
}
