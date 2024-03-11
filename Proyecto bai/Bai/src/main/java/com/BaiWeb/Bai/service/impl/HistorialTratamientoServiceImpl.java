package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.CitaDTO;
import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.DTO.HistorialTratamientoDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;
import com.BaiWeb.Bai.entity.HistorialTratamiento;
import com.BaiWeb.Bai.mapper.HistorialTratamientoMapper;
import com.BaiWeb.Bai.repository.HistorialTratamientoRepository;
import com.BaiWeb.Bai.service.HistorialTratamientoService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HistorialTratamientoServiceImpl implements HistorialTratamientoService {
    private HistorialTratamientoRepository historialTratamientoRepository;
    @Override
    public HistorialTratamientoDTO CreateHistorialTratamiento(HistorialTratamientoDTO historialTratamientoDTO) {
        HistorialTratamiento historialTratamiento = HistorialTratamientoMapper.mapToHistorialTratamiento(historialTratamientoDTO);
        HistorialTratamiento savedhistorialTratamiento = historialTratamientoRepository.save(historialTratamiento);
        return HistorialTratamientoMapper.mapToHistorialTratamientoDTO(savedhistorialTratamiento);
    }

    @Override
    public HistorialTratamientoDTO GetHistorialTratamientoById(Long id) {

        HistorialTratamiento historialTratamiento = historialTratamientoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Historial not found for id: " + id));
        return HistorialTratamientoMapper.mapToHistorialTratamientoDTO(historialTratamiento);
    }

    @Override
    public List<HistorialTratamientoDTO> getAllHistorialTratamiento() {

        List<HistorialTratamiento> historialTratamientos= historialTratamientoRepository.findAll();
        return  historialTratamientos.stream().map(HistorialTratamientoMapper::mapToHistorialTratamientoDTO)
                .collect(Collectors.toList());
    }
}
