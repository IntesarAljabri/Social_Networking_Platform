package Social_Networking_Platform.MyProject.Service;

import Social_Networking_Platform.MyProject.Models.Comments;
import Social_Networking_Platform.MyProject.Repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {

    @Autowired
    CommentsRepository commentsRespository;

    public List<Comments> getAllComments() {
        return commentsRespository.findAll();
    }

}
