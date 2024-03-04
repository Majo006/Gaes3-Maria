package com.BaiWeb.Bai.DTO;

import com.BaiWeb.Bai.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdministradorDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String contraseña;
    private UsuarioDTO usuario;

    public AdministradorDTO(Long id, String nombre, String apellido, String telefono, String correo, String contraseña, Usuario usuario) {
    }
}
