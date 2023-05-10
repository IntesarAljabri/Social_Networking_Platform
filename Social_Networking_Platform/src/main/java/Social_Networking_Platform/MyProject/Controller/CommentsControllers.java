package Social_Networking_Platform.MyProject.Controller;
import Social_Networking_Platform.MyProject.Models.Comments;
import Social_Networking_Platform.MyProject.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("events")
public class CommentsControllers {
    @Autowired
    CommentsService commentsService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Comments> getAllComments() {
        return commentsService.getAllComments();
    }
}
