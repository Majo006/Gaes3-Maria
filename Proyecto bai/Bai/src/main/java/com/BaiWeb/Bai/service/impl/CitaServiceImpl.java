package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.*;
import com.BaiWeb.Bai.entity.Cita;
import com.BaiWeb.Bai.mapper.CitaMapper;
import com.BaiWeb.Bai.repository.CitaRepository;
import com.BaiWeb.Bai.service.CitaService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CitaServiceImpl implements CitaService {
    private CitaRepository citaRepository;
    @Override
    public CitaDTO CreateCita(CitaDTO citaDTO) {
        Cita cita = CitaMapper.mapToCita(citaDTO);
        Cita savedCita = citaRepository.save(cita);
        return CitaMapper.mapToCitaDTO(savedCita);
    }

    @Override
    public CitaDTO GetCitaById(Long id) {
        Cita cita = citaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cita not found for id: " + id));
        return CitaMapper.mapToCitaDTO(cita);
    }
    @Override
    public List<CitaDTO> getAllCita() {
        List<Cita> citas = citaRepository.findAll();
        return citas.stream().map(CitaMapper::mapToCitaDTO)
                .collect(Collectors.toList());
    }
}
