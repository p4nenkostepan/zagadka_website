package com.secret.springApp.Controllers;

import com.secret.springApp.Models.Product;
import com.secret.springApp.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController
{
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public String productMain(Model model)
    {
        Iterable<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "product-main";
    }
}
