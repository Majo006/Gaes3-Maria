package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.EstadoCitaDTO;
import com.BaiWeb.Bai.entity.EstadoCita;
import com.BaiWeb.Bai.mapper.EstadoCitaMapper;
import com.BaiWeb.Bai.repository.EstadoCitaRepository;
import com.BaiWeb.Bai.service.EstadoCitaService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EstadoCitaServiceImpl implements EstadoCitaService {
    private EstadoCitaRepository estadoCitaRepository;
    @Override
    public EstadoCitaDTO CreateEstadoCita(EstadoCitaDTO estadoCitaDTO) {
        EstadoCita estadoCita = EstadoCitaMapper.mapToEstadoCita(estadoCitaDTO);
        EstadoCita savedEstadoCita = estadoCitaRepository.save(estadoCita);
        return EstadoCitaMapper.mapToEstadoCitaDTO(savedEstadoCita);
    }

    @Override
    public EstadoCitaDTO GetEstadoCitaById(Long id) {

        EstadoCita estadoCita = estadoCitaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Estado not found for id: " + id));
        return EstadoCitaMapper.mapToEstadoCitaDTO(estadoCita);
    }

    @Override
    public List<EstadoCitaDTO> getAllEstadoCita() {
        List<EstadoCita> estadoCitas = estadoCitaRepository.findAll();
        return estadoCitas.stream().map(EstadoCitaMapper::mapToEstadoCitaDTO)
                .collect(Collectors.toList());
    }
}
