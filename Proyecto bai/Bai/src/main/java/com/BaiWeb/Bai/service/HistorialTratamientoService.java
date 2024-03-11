package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.CitaDTO;
import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.DTO.HistorialTratamientoDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;

import java.util.List;

public interface HistorialTratamientoService {
    HistorialTratamientoDTO CreateHistorialTratamiento(HistorialTratamientoDTO historialTratamientoDTO);
    HistorialTratamientoDTO GetHistorialTratamientoById(Long Id);
    List<HistorialTratamientoDTO> getAllHistorialTratamiento();
}
