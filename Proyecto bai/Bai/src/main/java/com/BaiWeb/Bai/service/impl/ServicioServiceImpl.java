package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.ServicioDTO;
import com.BaiWeb.Bai.service.ServicioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;

@Service
@AllArgsConstructor
public class ServicioServiceImpl implements ServicioService {
    @Override
    public ServicioDTO CreateServicio(ServicioDTO servicioDTO) {
        return null;
    }

    @Override
    public ServicioDTO getServicioById(Long Id) {
        return null;
    }

    @Override
    public ServicioDTO GetServicioBynombre(String nombre) {
        return null;
    }

    @Override
    public ServicioDTO GetServicioBydescripcion(String descripcion) {
        return null;
    }

    @Override
    public ServicioDTO GetServicioByduracionaprox(Time duracionaprox) {
        return null;
    }

    @Override
    public ServicioDTO GetServicioByprecioaprox(BigDecimal precioaprox){
        return null;
    }

    @Override
    public List<ServicioDTO> getAllServicio() {
        return null;
    }
}
