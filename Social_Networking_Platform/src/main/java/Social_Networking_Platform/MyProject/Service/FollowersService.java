package Social_Networking_Platform.MyProject.Service;

import Social_Networking_Platform.MyProject.Models.Followers;
import Social_Networking_Platform.MyProject.Repository.FollowersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowersService {

    @Autowired
    FollowersRepository followersRepository;

    public List<Followers> getAllFollowers() {
        return followersRepository.findAll();
    }
}
