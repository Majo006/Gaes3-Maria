package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;
import com.BaiWeb.Bai.service.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {
    @Override
    public EmpleadoDTO CreateEmpleado(EmpleadoDTO empleadoDTO) {
        return null;
    }

    @Override
    public EmpleadoDTO GetEmpeladoById(Long Id) {
        return null;
    }

    @Override
    public EmpleadoDTO GetEmpeladoBynombre(String nombre) {
        return null;
    }

    @Override
    public EmpleadoDTO GetEmpeladoByapellido(String apellido) {
        return null;
    }

    @Override
    public EmpleadoDTO GetEmpeladoByhabilidades(String habilidades) {
        return null;
    }

    @Override
    public EmpleadoDTO GetEmpeladoBytelefono(String telefono) {
        return null;
    }

    @Override
    public EmpleadoDTO GetEmpeladoBycorreo(String correo) {
        return null;
    }

    @Override
    public EmpleadoDTO GetEmpeladoBycontraseña(String contraseña) {
        return null;
    }

    @Override
    public EmpleadoDTO GetEmpeladoByUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public List<EmpleadoDTO> getAllEmpleado() {
        return null;
    }
}
