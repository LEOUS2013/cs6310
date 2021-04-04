package group40.cs6310.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import javax.persistence.GeneratedValue;

@Controller
public class helloController {
    @GetMapping("/02")
    public String hello_Thymeleaf() {
        return "02";
    }

    @GetMapping("/01")
    public String hello_jsp(Model model) {
        model.addAttribute("hello", "hello. jsp");
        return "01";
    }
}
