package com.BaiWeb.Bai.DTO;

import com.BaiWeb.Bai.entity.Cita;
import com.BaiWeb.Bai.entity.Empleado;
import com.BaiWeb.Bai.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistorialTratamientoDTO {
    private Long id;
    private CitaDTO cita;
    private UsuarioDTO usuario;
    private EmpleadoDTO empleado;

    public HistorialTratamientoDTO(Long id, Set<Cita> cita, Usuario usuario, Set<Empleado> empleados) {
    }
}
