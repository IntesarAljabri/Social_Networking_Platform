package Social_Networking_Platform.MyProject.Service;

import Social_Networking_Platform.MyProject.Models.Likes;
import Social_Networking_Platform.MyProject.Repository.LikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LikesService {

    @Autowired
    LikesRepository likesRepository;

    public List<Likes> getAllLikes() {
        return likesRepository.findAll();
    }
}
