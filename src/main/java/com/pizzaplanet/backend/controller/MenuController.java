package com.pizzaplanet.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizzaplanet.backend.model.Menu;
import com.pizzaplanet.backend.repository.MenuRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Autoriser CORS uniquement pour React
public class MenuController {

    private final MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping("/menu")
    public List<Menu> getMenu() {
        return menuRepository.findAll(); // Récupère les menus depuis la base de données
    }
}
