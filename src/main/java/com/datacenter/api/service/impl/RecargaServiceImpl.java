package com.datacenter.api.service.impl;

import com.datacenter.api.dto.OperadorInfoDTO;
import com.datacenter.api.dto.RecargaDTO;

import com.datacenter.api.dto.RecargaResponseDTO;
import com.datacenter.api.model.EstadoRecarga;
import com.datacenter.api.model.Operador;
import com.datacenter.api.model.Recarga;
import com.datacenter.api.model.Usuario;
import com.datacenter.api.repository.OperadorRepository;
import com.datacenter.api.repository.RecargaRepository;
import com.datacenter.api.repository.UsuarioRepository;

import com.datacenter.api.service.RecargaService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class RecargaServiceImpl implements RecargaService {

    private final RecargaRepository recargaRepository;
    private final OperadorRepository operadorRepository;
    private final UsuarioRepository usuarioRepository;
    public static final ModelMapper modelMapper = new ModelMapper();

    public RecargaServiceImpl(RecargaRepository recargaRepository, OperadorRepository operadorRepository, UsuarioRepository usuarioRepository) {
        this.recargaRepository = recargaRepository;
        this.operadorRepository = operadorRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public RecargaResponseDTO crearRecarga(RecargaDTO recargaDTO) {
        Usuario usuario = usuarioRepository.findById(recargaDTO.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Operador operador = operadorRepository.findById(recargaDTO.getOperadorId())
                .orElseThrow(() -> new RuntimeException("Operador no encontrado"));

        Recarga recarga = new Recarga();
        recarga.setValor(recargaDTO.getValor());
        recarga.setNumeroTelefono(recargaDTO.getNumeroTelefono());
        recarga.setFecha(LocalDateTime.now());
        recarga.setUsuario(usuario);
        recarga.setOperador(operador);
        recarga.setEstado(EstadoRecarga.PENDIENTE);

        // Simular procesamiento con operador
        boolean exito = procesarConOperador(recarga);
        recarga.setEstado(exito ? EstadoRecarga.EXITOSA : EstadoRecarga.FALLIDA);

        return modelMapper.map(recargaRepository.save(recarga), RecargaResponseDTO.class);
    }

    public boolean procesarConOperador(Recarga recarga) {
        // Lógica de integración con API del operador
        // Simulamos un 95% de éxito
        return Math.random() > 0.05;
    }

    @Override
    public List<OperadorInfoDTO> getOperadores() {
        List<Operador> operadores = operadorRepository.findAll();


        return operadores.stream()
                .map(operador -> modelMapper.map(operador, OperadorInfoDTO.class))
                .collect(Collectors.toList());
    }







}
