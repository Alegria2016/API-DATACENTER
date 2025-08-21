package com.datacenter.api.service;

import com.datacenter.api.dto.OperadorInfoDTO;
import com.datacenter.api.dto.RecargaDTO;
import com.datacenter.api.dto.RecargaResponseDTO;
import com.datacenter.api.dto.VentaReporteDTO;
import com.datacenter.api.model.Recarga;

import java.util.List;

public interface RecargaService {
    RecargaResponseDTO crearRecarga(RecargaDTO recargaDTO);

    boolean procesarConOperador(Recarga recarga);

    List<OperadorInfoDTO> getOperadores();

}
