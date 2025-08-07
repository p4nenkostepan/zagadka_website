package com.secret.springApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BucketController
{
    @GetMapping("/bucket")
    public String bucket(Model model)
    {
        model.addAttribute("title", "Корзина");
        return "bucket"; // name
    }
}
