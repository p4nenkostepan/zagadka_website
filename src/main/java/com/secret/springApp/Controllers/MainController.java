package com.secret.springApp.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController
{
    @GetMapping("/")
    public String homePage(Model model)
    {
        model.addAttribute("title", "Main page");
        return "homePage";
    }
}
