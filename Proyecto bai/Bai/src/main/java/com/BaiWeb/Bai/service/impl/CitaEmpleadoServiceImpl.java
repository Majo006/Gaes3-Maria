package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.CitaDTO;
import com.BaiWeb.Bai.DTO.CitaEmpleadoDTO;
import com.BaiWeb.Bai.service.CitaEmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CitaEmpleadoServiceImpl implements CitaEmpleadoService {
    @Override
    public CitaEmpleadoDTO CreateCitaEmpleado(CitaEmpleadoDTO citaEmpleadoDTO) {
        return null;
    }

    @Override
    public CitaEmpleadoDTO GetCitaEmpleadoById(Long Id) {
        return null;
    }

    @Override
    public CitaEmpleadoDTO GetCitaEmpleadoByCita(CitaDTO citaDTO) {
        return null;
    }

    @Override
    public List<CitaEmpleadoDTO> getAllCitaEmpleado() {
        return null;
    }
}
