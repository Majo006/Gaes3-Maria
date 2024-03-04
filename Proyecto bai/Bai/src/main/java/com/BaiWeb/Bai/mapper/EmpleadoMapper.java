package com.BaiWeb.Bai.mapper;

import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.entity.Empleado;

public class EmpleadoMapper {
    public static EmpleadoDTO mapToEmpleadoDTO(Empleado empleado){
        return new EmpleadoDTO(
                empleado.getId(),
                empleado.getNombre(),
                empleado.getApellido(),
                empleado.getHabilidades(),
                empleado.getTelefono(),
                empleado.getCorreo(),
                empleado.getContraseña(),
                empleado.getUsuario()
        );
    }
    public static Empleado mapToEmpleado(EmpleadoDTO empleadoDTO){
        return new Empleado(
                empleadoDTO.getId(),
                empleadoDTO.getNombre(),
                empleadoDTO.getApellido(),
                empleadoDTO.getHabilidades(),
                empleadoDTO.getTelefono(),
                empleadoDTO.getCorreo(),
                empleadoDTO.getContraseña(),
                empleadoDTO.getUsuario()
        );
    }
}
