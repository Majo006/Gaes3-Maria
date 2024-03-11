package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;

import java.util.List;

public interface EmpleadoService {

    EmpleadoDTO CreateEmpleado(EmpleadoDTO empleadoDTO);

    EmpleadoDTO GetEmpeladoById(Long Id);

    List<EmpleadoDTO> getAllEmpleado();
}
