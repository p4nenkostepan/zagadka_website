package com.secret.springApp.Controllers;

import com.secret.springApp.Models.Product;
import com.secret.springApp.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping("/product/{id}")
    public String productPage(@PathVariable Long id, Model model)
    {
        Product product = productRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Товар не найден: " + id));
        model.addAttribute("product", product);
        return "productPage";
    }
}
