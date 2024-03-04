package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.EstadoCitaDTO;

import java.util.List;

public interface EstadoCitaService {
    EstadoCitaDTO CreateEstadoCita(EstadoCitaDTO estadoCitaDTO);
    EstadoCitaDTO GetEstadoCitaById(Long Id);
    EstadoCitaDTO GetEstadoCitaByestado(String estado);
    List<EstadoCitaDTO> getAllEstadoCita();
}
