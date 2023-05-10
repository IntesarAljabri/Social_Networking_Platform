package Social_Networking_Platform.MyProject.Service;

import Social_Networking_Platform.MyProject.Models.Groups;
import Social_Networking_Platform.MyProject.Repository.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupsService {

    @Autowired
    GroupsRepository groupsRepository;

    public List<Groups> getAllGroups() {
        return groupsRepository.findAll();
    }
}
