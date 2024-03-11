package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.AdministradorDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;


import java.util.List;

public interface AdministradorService {

   AdministradorDTO CreateAdministrador(AdministradorDTO administradorDTO);

    AdministradorDTO getAdministradorById(Long Id);
    List<AdministradorDTO> getAllAdministrador();
}
