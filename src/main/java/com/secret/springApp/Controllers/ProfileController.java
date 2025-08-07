package com.secret.springApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController
{
    @GetMapping("/profile")
    public String profile(Model model)
    {
        model.addAttribute("title", "Личный кабинет");
        return "profile"; // name
    }
}
