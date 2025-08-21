package com.datacenter.api.enums;

public enum EstadoRecarga {
    PENDIENTE,
    EXITOSA,
    FALLIDA;


    @Override
    public String toString() {
        return this.name();
    }
}
