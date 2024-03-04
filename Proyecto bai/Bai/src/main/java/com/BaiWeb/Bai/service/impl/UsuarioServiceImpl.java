package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.UsuarioDTO;
import com.BaiWeb.Bai.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    @Override
    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public UsuarioDTO getUsuarioById(Long id) {
        return null;
    }

    @Override
    public UsuarioDTO GetUsuarioBynombre(String nombre) {
        return null;
    }

    @Override
    public UsuarioDTO GetUsuarioByapellido(String apellido) {
        return null;
    }

    @Override
    public UsuarioDTO GetUsuarioByycorreoelectronico(String correoelectronico) {
        return null;
    }

    @Override
    public UsuarioDTO GetUsuarioBytelefono(Long telefono) {
        return null;
    }

    @Override
    public UsuarioDTO GetUsuarioBycontraseña(String contraseña) {
        return null;
    }

    @Override
    public UsuarioDTO GetUsuarioByverificacioncorreo(Boolean verificacioncorreo) {
        return null;
    }

    @Override
    public UsuarioDTO GetUsuarioByaceptaciondatos(Boolean aceptaciondatos) {
        return null;
    }

    @Override
    public UsuarioDTO GetUsuarioBytipousuario(String tipousuario) {
        return null;
    }

    @Override
    public List<UsuarioDTO> getAllUsuarios() {
        return null;
    }
}
