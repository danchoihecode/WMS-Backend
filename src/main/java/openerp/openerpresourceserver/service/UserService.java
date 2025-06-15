package openerp.openerpresourceserver.service;

import java.util.List;

import openerp.openerpresourceserver.entity.User;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(String id);

    void synchronizeUser(String userId, String email, String firstName, String lastName);

}
