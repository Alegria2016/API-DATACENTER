package com.datacenter.api.controller;

import com.datacenter.api.dto.OperadorInfoDTO;
import com.datacenter.api.dto.RecargaDTO;
import com.datacenter.api.dto.RecargaResponseDTO;
import com.datacenter.api.dto.VentaReporteDTO;
import com.datacenter.api.service.impl.RecargaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/recargas")
@CrossOrigin(origins = "http://localhost:4200")
public class RecargaController {

    private final RecargaServiceImpl recargaService;

    public RecargaController(RecargaServiceImpl recargaService) {
        this.recargaService = recargaService;
    }


    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Servicio funcionando correctamente");
    }





    @PostMapping
    public ResponseEntity<?> crearRecarga(@RequestBody RecargaDTO recargaDTO) {
        try {
            RecargaResponseDTO recarga = recargaService.crearRecarga(recargaDTO);
            return ResponseEntity.ok(recarga);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
