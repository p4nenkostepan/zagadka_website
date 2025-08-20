package com.secret.springApp.Controllers;

import com.secret.springApp.Models.Order;
import com.secret.springApp.Repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController
{
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/order")
    public String orderMain(Model model)
    {
        Iterable<Order> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "order-main";
    }
}
