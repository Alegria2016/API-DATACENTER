package com.datacenter.api.controller;

import com.datacenter.api.dto.OperadorInfoDTO;
import com.datacenter.api.service.RecargaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/operadores")
@CrossOrigin(origins = "http://localhost:4200")
public class OperadorController {

    private final RecargaService recargaService;

    public OperadorController(RecargaService recargaService) {
        this.recargaService = recargaService;
    }

    @GetMapping
    public ResponseEntity<List<OperadorInfoDTO>> obtenerTodosOperadores() {
        try {
            List<OperadorInfoDTO> operadores = recargaService.getOperadores();
            return ResponseEntity.ok(operadores);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
