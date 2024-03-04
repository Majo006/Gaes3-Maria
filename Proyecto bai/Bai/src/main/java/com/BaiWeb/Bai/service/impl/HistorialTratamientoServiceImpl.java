package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.CitaDTO;
import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.DTO.HistorialTratamientoDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;
import com.BaiWeb.Bai.service.HistorialTratamientoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HistorialTratamientoServiceImpl implements HistorialTratamientoService {
    @Override
    public HistorialTratamientoDTO CreateHistorialTratamiento(HistorialTratamientoDTO historialTratamientoDTO) {
        return null;
    }

    @Override
    public HistorialTratamientoDTO GetHistorialTratamientoById(Long Id) {
        return null;
    }

    @Override
    public HistorialTratamientoDTO GetHistorialTratamientoByCitas(CitaDTO cita) {
        return null;
    }

    @Override
    public HistorialTratamientoDTO GetHistorialTratamientoByUsuario(UsuarioDTO usuario) {
        return null;
    }

    @Override
    public HistorialTratamientoDTO GetHistorialTratamientoByEmpleado(EmpleadoDTO empleado) {
        return null;
    }

    @Override
    public List<HistorialTratamientoDTO> getAllHistorialTratamiento() {
        return null;
    }
}
