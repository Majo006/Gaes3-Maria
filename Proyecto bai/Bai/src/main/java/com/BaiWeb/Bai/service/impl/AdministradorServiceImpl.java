package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.AdministradorDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;
import com.BaiWeb.Bai.service.AdministradorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdministradorServiceImpl implements AdministradorService {
    @Override
    public AdministradorDTO CreateAdministrador(AdministradorDTO administradorDTO) {
        return null;
    }

    @Override
    public AdministradorDTO getAdministradorById(Long Id) {
        return null;
    }

    @Override
    public AdministradorDTO getAdministradorBynombre(String nombre) {
        return null;
    }

    @Override
    public AdministradorDTO getAdministradorByapellido(String apellido) {
        return null;
    }

    @Override
    public AdministradorDTO getAdministradorBytelefono(String telefono) {
        return null;
    }

    @Override
    public AdministradorDTO getAdministradorBycorreo(String correo) {
        return null;
    }

    @Override
    public AdministradorDTO getAdministradorBycontraseña(String contraseña) {
        return null;
    }

    @Override
    public AdministradorDTO getAdministradorByUsuario(UsuarioDTO usuario) {
        return null;
    }

    @Override
    public List<AdministradorDTO> getAllAdministrador() {
        return null;
    }
}
