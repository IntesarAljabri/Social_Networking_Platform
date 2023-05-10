package Social_Networking_Platform.MyProject.Controller;
import Social_Networking_Platform.MyProject.Models.Users;
import Social_Networking_Platform.MyProject.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersControllers {
    @Autowired
    UsersService usersService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Users> getAllUsers() {

        return usersService.getAllUsers();
    }

}
