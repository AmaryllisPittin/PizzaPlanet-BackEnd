package com.pizzaplanet.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Autoriser CORS uniquement pour React
public class MenuController {

    @GetMapping("/menu")
    public List<String> getMenu() {
        return Arrays.asList("Pizza Margherita", "Pizza Pepperoni", "Pizza Végétarienne");
    }
}
