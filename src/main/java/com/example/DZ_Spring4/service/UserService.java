package com.example.DZ_Spring4.service;

import com.example.DZ_Spring4.model.User;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class UserService {
    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }
}
