package com.datacenter.api.utils;

public class EnumUtils {
    public static boolean isValidEstadoRecarga(String estado) {
        return "PENDIENTE".equals(estado) ||
                "EXITOSA".equals(estado) ||
                "FALLIDA".equals(estado);
    }

    public static boolean isValidRolUsuario(String rol) {
        return "ADMIN".equals(rol) || "VENDEDOR".equals(rol);
    }
}
