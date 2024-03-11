package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.ServicioDTO;
import com.BaiWeb.Bai.entity.Servicio;
import com.BaiWeb.Bai.mapper.ServicioMapper;
import com.BaiWeb.Bai.repository.ServicioRepository;
import com.BaiWeb.Bai.service.ServicioService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicioServiceImpl implements ServicioService {
    private ServicioRepository servicioRepository;
    @Override
    public ServicioDTO CreateServicio(ServicioDTO servicioDTO) {

        Servicio servicio = ServicioMapper.mapToServicio(servicioDTO);
        Servicio savedServicio = servicioRepository.save(servicio);
        return ServicioMapper.mapToServicioDTO(savedServicio);
    }

    @Override
    public ServicioDTO getServicioById(Long id) {
        Servicio servicio = servicioRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Servicio not found for id: " + id));
        return ServicioMapper.mapToServicioDTO(servicio);
    }

    @Override
    public List<ServicioDTO> getAllServicio() {
        List<Servicio> servicios=servicioRepository.findAll();
        return servicios.stream().map(ServicioMapper::mapToServicioDTO)
                .collect(Collectors.toList());
    }
}
