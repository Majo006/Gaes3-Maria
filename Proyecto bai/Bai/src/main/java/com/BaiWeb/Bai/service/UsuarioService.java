package com.BaiWeb.Bai.service;


import com.BaiWeb.Bai.DTO.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    UsuarioDTO createUsuario(UsuarioDTO usuarioDTO);
    UsuarioDTO getUsuarioById(Long id);


    List<UsuarioDTO> getAllUsuarios();

}
