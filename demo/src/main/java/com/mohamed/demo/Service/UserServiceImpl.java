package com.mohamed.demo.Service;

import com.mohamed.demo.model.User;
import com.mohamed.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService{
    private final UserRepo userRepository;

    @Autowired
    public UserServiceImpl (UserRepo userRepository) {

        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public int addUser(User user) {
        return userRepository.save(user);
    }

}
