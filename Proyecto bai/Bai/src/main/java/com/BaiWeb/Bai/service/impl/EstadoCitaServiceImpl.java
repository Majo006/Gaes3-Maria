package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.EstadoCitaDTO;
import com.BaiWeb.Bai.service.EstadoCitaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EstadoCitaServiceImpl implements EstadoCitaService {
    @Override
    public EstadoCitaDTO CreateEstadoCita(EstadoCitaDTO estadoCitaDTO) {
        return null;
    }

    @Override
    public EstadoCitaDTO GetEstadoCitaById(Long Id) {
        return null;
    }

    @Override
    public EstadoCitaDTO GetEstadoCitaByestado(String estado) {
        return null;
    }

    @Override
    public List<EstadoCitaDTO> getAllEstadoCita() {
        return null;
    }
}
