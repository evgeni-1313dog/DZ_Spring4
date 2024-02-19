package com.example.DZ_Spring4;


import com.example.DZ_Spring4.model.User;
import com.example.DZ_Spring4.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @GetMapping("/paint")
    public String userPaint(Model model){

        return "userPaint";
    }

    @PostMapping("?/newUser")
    public User addUser(User user){
        userService.addUser(user);
        return user;
    }
}
