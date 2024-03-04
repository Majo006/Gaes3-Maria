package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.AdministradorDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;


import java.util.List;

public interface AdministradorService {

   AdministradorDTO CreateAdministrador(AdministradorDTO administradorDTO);

    AdministradorDTO getAdministradorById(Long Id);
    AdministradorDTO getAdministradorBynombre(String nombre);

    AdministradorDTO getAdministradorByapellido(String apellido);
    AdministradorDTO getAdministradorBytelefono(String telefono);
    AdministradorDTO getAdministradorBycorreo(String correo);
    AdministradorDTO getAdministradorBycontraseña(String contraseña);
    AdministradorDTO getAdministradorByUsuario(UsuarioDTO usuario);
    List<AdministradorDTO> getAllAdministrador();
}
