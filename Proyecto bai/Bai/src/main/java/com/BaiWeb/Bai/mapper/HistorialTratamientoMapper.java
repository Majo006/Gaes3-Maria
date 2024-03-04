package com.BaiWeb.Bai.mapper;

import com.BaiWeb.Bai.DTO.HistorialTratamientoDTO;
import com.BaiWeb.Bai.entity.HistorialTratamiento;

public class HistorialTratamientoMapper {
  public static HistorialTratamientoDTO mapToHistorialTratamientoDTO(HistorialTratamiento historialTratamiento){
        return new HistorialTratamientoDTO(
                historialTratamiento.getId(),
                historialTratamiento.getCita(),
                historialTratamiento.getUsuario(),
                historialTratamiento.getEmpleados()
        );
  }
  public static HistorialTratamiento mapToHistorialTratamiento(HistorialTratamientoDTO historialTratamientoDTO){
      return new HistorialTratamiento(
              historialTratamientoDTO.getId(),
              historialTratamientoDTO.getCita(),
              historialTratamientoDTO.getUsuario(),
              historialTratamientoDTO.getEmpleado()
      );
  }
}
