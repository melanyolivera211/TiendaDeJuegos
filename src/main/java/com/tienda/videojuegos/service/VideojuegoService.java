package com.tienda.videojuegos.service;

import com.tienda.videojuegos.domain.Videojuego;
import com.tienda.videojuegos.repository.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoRepository videojuegoRepository;

    @Transactional(readOnly = true)
    public List<Videojuego> listar() {
        return videojuegoRepository.findAll();
    }

    @Transactional
    public void guardar(Videojuego videojuego) {
        videojuegoRepository.save(videojuego);
    }
}
