package com.datacenter.api.dto;

public class OperadorInfoDTO {
    private Long id;
    private String nombre;

    // Constructores
    public OperadorInfoDTO() {
    }

    public OperadorInfoDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}