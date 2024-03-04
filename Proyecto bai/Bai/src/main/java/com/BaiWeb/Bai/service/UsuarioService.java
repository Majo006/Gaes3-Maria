package com.BaiWeb.Bai.service;


import com.BaiWeb.Bai.DTO.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    UsuarioDTO createUsuario(UsuarioDTO usuarioDTO);
    UsuarioDTO getUsuarioById(Long id);

    UsuarioDTO GetUsuarioBynombre(String nombre);
    UsuarioDTO GetUsuarioByapellido(String apellido);
    UsuarioDTO GetUsuarioByycorreoelectronico(String correoelectronico);
    UsuarioDTO GetUsuarioBytelefono(Long telefono);
    UsuarioDTO GetUsuarioBycontraseña(String contraseña);
    UsuarioDTO GetUsuarioByverificacioncorreo(Boolean verificacioncorreo);
    UsuarioDTO GetUsuarioByaceptaciondatos(Boolean aceptaciondatos);
    UsuarioDTO GetUsuarioBytipousuario(String tipousuario);
    List<UsuarioDTO> getAllUsuarios();

}
