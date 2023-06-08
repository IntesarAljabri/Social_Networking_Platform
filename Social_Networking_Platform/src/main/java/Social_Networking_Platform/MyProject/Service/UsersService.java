package Social_Networking_Platform.MyProject.Service;

import Social_Networking_Platform.MyProject.Models.Users;
import Social_Networking_Platform.MyProject.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }
}
