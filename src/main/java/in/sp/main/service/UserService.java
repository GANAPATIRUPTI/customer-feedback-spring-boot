package in.sp.main.service;

import in.sp.main.entity.User;

public interface UserService {

    User registerUser(User user);

    User findByUsername(String username);
}
