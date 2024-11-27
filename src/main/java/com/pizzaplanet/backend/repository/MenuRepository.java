package com.pizzaplanet.backend.repository;

import com.pizzaplanet.backend.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
