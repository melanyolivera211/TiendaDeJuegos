package com.tienda.videojuegos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tienda.videojuegos.domain.Videojuego;
import com.tienda.videojuegos.service.VideojuegoService;

@Controller
public class VideojuegoController {

    @Autowired
    private VideojuegoService videojuegoService;

    // Redirección desde la raíz
    @GetMapping("/")
    public String redirectToIndex() {
        return "redirect:/videojuegos";
    }

    // Mostrar catálogo de videojuegos
    @GetMapping("/videojuegos")
    public String listarVideojuegos(Model model) {
        List<Videojuego> videojuegos = videojuegoService.listar();
        model.addAttribute("videojuegos", videojuegos);
        return "index";
    }

    // Mostrar formulario para agregar nuevo videojuego
    @GetMapping("/videojuegos/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("videojuego", new Videojuego());
        return "form";
    }

    // Guardar videojuego y redirigir al catálogo
    @PostMapping("/videojuegos/agregar")
    public String agregarVideojuego(@ModelAttribute Videojuego videojuego) {
        videojuegoService.guardar(videojuego);
        return "redirect:/videojuegos";
    }
}
