package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import in.sp.main.entity.User;
import in.sp.main.service.UserService;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    // handle form submit
    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userService.registerUser(user);
        return "redirect:/login";
    }
}
