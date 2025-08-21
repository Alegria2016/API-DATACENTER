package com.datacenter.api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RecargaResponseDTO {
    private Long id;
    private BigDecimal valor;
    private LocalDateTime fecha;
    private String numeroTelefono;
    private String estado;
    private UsuarioInfoDTO usuario;
    private OperadorInfoDTO operador;

    // Constructores
    public RecargaResponseDTO() {
    }

    public RecargaResponseDTO(Long id, BigDecimal valor, LocalDateTime fecha,
                              String numeroTelefono, String estado,
                              UsuarioInfoDTO usuario, OperadorInfoDTO operador) {
        this.id = id;
        this.valor = valor;
        this.fecha = fecha;
        this.numeroTelefono = numeroTelefono;
        this.estado = estado;
        this.usuario = usuario;
        this.operador = operador;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public UsuarioInfoDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioInfoDTO usuario) {
        this.usuario = usuario;
    }

    public OperadorInfoDTO getOperador() {
        return operador;
    }

    public void setOperador(OperadorInfoDTO operador) {
        this.operador = operador;
    }
}
