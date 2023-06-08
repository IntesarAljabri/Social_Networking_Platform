package Social_Networking_Platform.MyProject.Service;

import Social_Networking_Platform.MyProject.Models.Posts;
import Social_Networking_Platform.MyProject.Repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostsService {

    @Autowired
    PostsRepository postsRepository;

    public List<Posts> getAllPosts() {
        return postsRepository.findAll();
    }
}
