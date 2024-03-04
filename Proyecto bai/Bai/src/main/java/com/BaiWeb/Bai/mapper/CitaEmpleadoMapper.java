package com.BaiWeb.Bai.mapper;

import com.BaiWeb.Bai.DTO.CitaEmpleadoDTO;
import com.BaiWeb.Bai.entity.CitaEmpleado;

public class CitaEmpleadoMapper {
    public static CitaEmpleadoDTO mapToCitaEmpleadoDTO(CitaEmpleado citaEmpleado){
        return new CitaEmpleadoDTO(
                citaEmpleado.getId(),
                citaEmpleado.getCita()
        );
    }
    public static CitaEmpleado mapToCitaEmpleado(CitaEmpleadoDTO citaEmpleadoDTO){
        return new CitaEmpleado(
                citaEmpleadoDTO.getId(),
                citaEmpleadoDTO.getCita()
        );
    }
}
