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
public class EmpleadoDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String habilidades;
    private String telefono;
    private String correo;
    private String contraseña;
    private UsuarioDTO usuario;

    public EmpleadoDTO(Long id, String nombre, String apellido, String habilidades, String telefono, String correo, String contraseña, Usuario usuario) {
    }
}
