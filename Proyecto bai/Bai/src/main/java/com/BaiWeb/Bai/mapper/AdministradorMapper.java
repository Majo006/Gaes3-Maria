package com.BaiWeb.Bai.mapper;

import com.BaiWeb.Bai.DTO.AdministradorDTO;
import com.BaiWeb.Bai.entity.Administrador;

public class AdministradorMapper {
    public static AdministradorDTO mapToAdministradorDTO(Administrador administrador){
        return new AdministradorDTO(
                administrador.getId(),
                administrador.getNombre(),
                administrador.getApellido(),
                administrador.getTelefono(),
                administrador.getCorreo(),
                administrador.getContraseña(),
                administrador.getUsuario()
        );
    }
    public static  Administrador mapToAdministrador(AdministradorDTO administradorDTO){
        return new Administrador(
                administradorDTO.getId(),
                administradorDTO.getNombre(),
                administradorDTO.getApellido(),
                administradorDTO.getTelefono(),
                administradorDTO.getCorreo(),
                administradorDTO.getContraseña(),
                administradorDTO.getUsuario()
        );
    }
}
