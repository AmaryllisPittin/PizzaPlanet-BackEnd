package com.pizzaplanet.backend.config; // Assurez-vous que le package correspond à votre projet

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Autorise toutes les routes
                .allowedOrigins("http://localhost:3003") // Autorise les requêtes de React (localhost:3000)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Autorise les méthodes HTTP
                .allowedHeaders("*") // Autorise tous les en-têtes
                .allowCredentials(true); // Autorise l'envoi de cookies (si nécessaire)
    }
}
