package com.secret.springApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController
{
    @GetMapping("/info")
    public String about(Model model)
    {
        model.addAttribute("title", "Загадка | О нас");
        return "info"; // name
    }
}
