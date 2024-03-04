package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;

import java.util.List;

public interface EmpleadoService {

    EmpleadoDTO CreateEmpleado(EmpleadoDTO empleadoDTO);

    EmpleadoDTO GetEmpeladoById(Long Id);
    EmpleadoDTO GetEmpeladoBynombre(String nombre);
    EmpleadoDTO GetEmpeladoByapellido(String apellido);
    EmpleadoDTO GetEmpeladoByhabilidades(String habilidades);
    EmpleadoDTO GetEmpeladoBytelefono(String telefono);
    EmpleadoDTO GetEmpeladoBycorreo(String correo);
    EmpleadoDTO GetEmpeladoBycontraseña(String contraseña);
    EmpleadoDTO GetEmpeladoByUsuario(UsuarioDTO usuarioDTO);
    List<EmpleadoDTO> getAllEmpleado();
}
