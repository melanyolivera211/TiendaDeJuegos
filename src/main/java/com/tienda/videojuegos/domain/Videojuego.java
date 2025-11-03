package com.tienda.videojuegos.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "videojuegos")
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String categoria;

    @Column(length = 500)
    private String descripcion;

    @Column(nullable = false)
    private Double precio;

    private String imagen;

    // Constructor vacío
    public Videojuego() {
    }

    // Constructor con argumentos
    public Videojuego(String nombre, String categoria, String descripcion, Double precio, String imagen) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Videojuego{"
                + "id=" + id
                + ", nombre='" + nombre + '\''
                + ", categoria='" + categoria + '\''
                + ", descripcion='" + descripcion + '\''
                + ", precio=" + precio
                + ", imagen='" + imagen + '\''
                + '}';
    }
}
