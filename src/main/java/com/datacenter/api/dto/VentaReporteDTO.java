package com.datacenter.api.dto;

import java.math.BigDecimal;

public class VentaReporteDTO {
    private String operador;
    private Long cantidad;
    private BigDecimal total;
    private String vendedor;
    private BigDecimal comisionTotal;

    // Constructor para consulta por operador (3 parámetros)
    public VentaReporteDTO(String operador, Long cantidad, BigDecimal total) {
        this.operador = operador;
        this.cantidad = cantidad;
        this.total = total;
    }

    // Constructor para consulta por vendedor (4 parámetros)
    public VentaReporteDTO(String vendedor, String operador, Long cantidad, BigDecimal total) {
        this.vendedor = vendedor;
        this.operador = operador;
        this.cantidad = cantidad;
        this.total = total;
    }

    // Constructor para consulta con comisiones (5 parámetros)
    public VentaReporteDTO(String operador, Long cantidad, BigDecimal total,
                           String vendedor, BigDecimal comisionTotal) {
        this.operador = operador;
        this.cantidad = cantidad;
        this.total = total;
        this.vendedor = vendedor;
        this.comisionTotal = comisionTotal;
    }

    public VentaReporteDTO() {

    }

    // Getters y setters
    public String getOperador() { return operador; }
    public void setOperador(String operador) { this.operador = operador; }

    public Long getCantidad() { return cantidad; }
    public void setCantidad(Long cantidad) { this.cantidad = cantidad; }

    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }

    public String getVendedor() { return vendedor; }
    public void setVendedor(String vendedor) { this.vendedor = vendedor; }

    public BigDecimal getComisionTotal() { return comisionTotal; }
    public void setComisionTotal(BigDecimal comisionTotal) { this.comisionTotal = comisionTotal; }
}
