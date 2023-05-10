package Social_Networking_Platform.MyProject.Controller;
import Social_Networking_Platform.MyProject.Models.Posts;
import Social_Networking_Platform.MyProject.Service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsControllers {

    @Autowired
    PostsService postsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Posts> getAllPosts() {

        return postsService.getAllPosts();
    }
}
