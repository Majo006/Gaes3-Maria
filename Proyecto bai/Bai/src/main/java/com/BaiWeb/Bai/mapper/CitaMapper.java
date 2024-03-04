package com.BaiWeb.Bai.mapper;

import com.BaiWeb.Bai.DTO.*;
import com.BaiWeb.Bai.entity.Agenda;
import com.BaiWeb.Bai.entity.Cita;

import java.sql.Date;

public class CitaMapper {
    public static CitaDTO mapToCitaDTO(Cita cita){
        return new CitaDTO(
                cita.getId(),
                cita.getFecha(),
                cita.getHora(),
                cita.getConfirmacion(),
                (AgendaDTO) cita.getAgenda(),
                (UsuarioDTO) cita.getUsuario(),
                (EmpleadoDTO) cita.getEmpleado(),
                (EstadoCitaDTO) cita.getEstado(),
                (ServicioDTO) cita.getServicios()
        );
    }
    public static Cita mapToCita(CitaDTO citaDTO){
        return new Cita(
                citaDTO.getId(),
                (Date) citaDTO.getFecha(),
                citaDTO.getHora(),
                citaDTO.getConfirmación(),
                citaDTO.getAgenda(),
                citaDTO.getUsuario(),
                citaDTO.getEmpleado(),
                citaDTO.getEstado(),
                citaDTO.getServicios()
        );
    }
}
