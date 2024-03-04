package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface CitaService {

    CitaDTO CreateCita(CitaDTO citaDTO);
    CitaDTO GetCitaById(Long Id);
    CitaDTO GetCitaByfecha(Date fecha);
    CitaDTO GetCitaByhora(Time hora);
    CitaDTO GetCitaByconfirmacion(Boolean confirmacion);
    CitaDTO GetCitaByAgenda(AgendaDTO agenda);
    CitaDTO GetCitaByUsuario(UsuarioDTO usuario);
    CitaDTO GetCitaByEmpleado(EmpleadoDTO empleado);
    CitaDTO GetCitaByEstado(EstadoCitaDTO estadoCita);
    CitaDTO GetCitaByServicio(ServicioDTO servicio);
    List<CitaDTO> getAllCita();
}
