package edu.wctc.springbootlab.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @GetMapping("/view-cart")
    public String showCart(){
        return "orders/cart";
    }

    @RequestMapping("product/detail")
    public String showProductDetail(){
        return "catalog/product-detail";
    }

    @PostMapping("/place-order")
    public String redirectToHome(){
        return "redirect:/";
    }

    @RequestMapping("/search")
    public String redirectSearch(){
        return "redirect:http://www.google.com";
    }
}
