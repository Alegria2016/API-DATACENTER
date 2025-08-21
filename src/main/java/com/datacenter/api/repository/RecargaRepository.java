package com.datacenter.api.repository;

import com.datacenter.api.dto.VentaReporteDTO;
import com.datacenter.api.model.Recarga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface RecargaRepository extends JpaRepository<Recarga, Long> {
    // Consulta corregida - por operador (3 parámetros)
    @Query("SELECT new com.datacenter.api.dto.VentaReporteDTO(o.nombre, COUNT(r), SUM(r.valor)) " +
            "FROM Recarga r JOIN r.operador o " +
            "WHERE r.estado = 'EXITOSA' " +
            "GROUP BY o.nombre " +
            "ORDER BY SUM(r.valor) DESC")
    List<VentaReporteDTO> findVentasPorOperador();

    // Consulta corregida - por vendedor (4 parámetros)
    @Query("SELECT new com.datacenter.api.dto.VentaReporteDTO(u.nombre, o.nombre, COUNT(r), SUM(r.valor)) " +
            "FROM Recarga r JOIN r.operador o JOIN r.usuario u " +
            "WHERE r.estado = 'EXITOSA' " +
            "GROUP BY u.nombre, o.nombre " +
            "ORDER BY u.nombre, SUM(r.valor) DESC")
    List<VentaReporteDTO> findVentasPorVendedor();

    // Consulta corregida - comisiones por operador (5 parámetros)
    @Query("SELECT new com.datacenter.api.dto.VentaReporteDTO(o.nombre, COUNT(r), SUM(r.valor), null, " +
            "SUM(r.valor * o.comision / 100)) " +
            "FROM Recarga r JOIN r.operador o " +
            "WHERE r.estado = 'EXITOSA' " +
            "GROUP BY o.nombre, o.comision " +
            "ORDER BY SUM(r.valor) DESC")
    List<VentaReporteDTO> findVentasYComisionesPorOperador();

    // Consultas básicas
    List<Recarga> findByUsuarioId(Long usuarioId);
    List<Recarga> findByOperadorId(Long operadorId);

    // Consulta con filtro de fechas
    @Query("SELECT r FROM Recarga r WHERE r.estado = 'EXITOSA' AND r.fecha BETWEEN :start AND :end")
    List<Recarga> findByFechaBetween(@Param("start") LocalDateTime start, @Param("end") LocalDateTime end);

    // Consulta simple para testing
    @Query("SELECT COUNT(r) FROM Recarga r WHERE r.estado = 'EXITOSA'")
    Long countRecargasExitosas();


    List<Recarga> findByEstado(String estado);

    List<Recarga> findByEstadoAndFechaBetween(String estado, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
