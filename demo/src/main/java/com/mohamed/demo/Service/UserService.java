package com.mohamed.demo.Service;

import com.mohamed.demo.model.User;
import com.mohamed.demo.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers() ;


    public int addUser(User user) ;


}
