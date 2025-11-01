package com.secret.springApp.Controllers;

import com.secret.springApp.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController
{
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/profile")
    public String profile(Model model)
    {
        model.addAttribute("title", "Личный кабинет");
        return "profile"; // name
    }

    @GetMapping("/profile/bonuses")
    public String bonuses(Model model)
    {
        model.addAttribute("title", "Бонусная система");
        return "profile/bonuses";
    }


}
