package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.CitaDTO;
import com.BaiWeb.Bai.DTO.CitaEmpleadoDTO;

import java.util.List;

public interface CitaEmpleadoService {
    CitaEmpleadoDTO CreateCitaEmpleado(CitaEmpleadoDTO citaEmpleadoDTO);
    CitaEmpleadoDTO GetCitaEmpleadoById(Long Id);
    CitaEmpleadoDTO GetCitaEmpleadoByCita(CitaDTO citaDTO);
    List<CitaEmpleadoDTO> getAllCitaEmpleado();
}
