package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.CitaDTO;
import com.BaiWeb.Bai.DTO.CitaEmpleadoDTO;
import com.BaiWeb.Bai.entity.CitaEmpleado;
import com.BaiWeb.Bai.mapper.CitaEmpleadoMapper;
import com.BaiWeb.Bai.repository.CitaEmpleadoRepository;
import com.BaiWeb.Bai.service.CitaEmpleadoService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CitaEmpleadoServiceImpl implements CitaEmpleadoService {
    private CitaEmpleadoRepository citaEmpleadoRepository;
    @Override
    public CitaEmpleadoDTO CreateCitaEmpleado(CitaEmpleadoDTO citaEmpleadoDTO) {
        CitaEmpleado citaEmpleado = CitaEmpleadoMapper.mapToCitaEmpleado(citaEmpleadoDTO);
        CitaEmpleado savedCitaE = citaEmpleadoRepository.save(citaEmpleado);
        return CitaEmpleadoMapper.mapToCitaEmpleadoDTO(savedCitaE);
    }

    @Override
    public CitaEmpleadoDTO GetCitaEmpleadoById(Long id) {
        CitaEmpleado citaEmpleado = citaEmpleadoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cita not found for id: " + id));
        return CitaEmpleadoMapper.mapToCitaEmpleadoDTO(citaEmpleado);
    }

    @Override
    public List<CitaEmpleadoDTO> getAllCitaEmpleado() {
        List<CitaEmpleado> citaEmpleados = citaEmpleadoRepository.findAll();
        return citaEmpleados.stream().map(CitaEmpleadoMapper::mapToCitaEmpleadoDTO)
                .collect(Collectors.toList());
    }
}
