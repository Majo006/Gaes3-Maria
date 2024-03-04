package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.*;
import com.BaiWeb.Bai.service.CitaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class CitaServiceImpl implements CitaService {
    @Override
    public CitaDTO CreateCita(CitaDTO citaDTO) {
        return null;
    }

    @Override
    public CitaDTO GetCitaById(Long Id) {
        return null;
    }

    @Override
    public CitaDTO GetCitaByfecha(Date fecha) {
        return null;
    }

    @Override
    public CitaDTO GetCitaByhora(Time hora) {
        return null;
    }

    @Override
    public CitaDTO GetCitaByconfirmacion(Boolean confirmacion) {
        return null;
    }

    @Override
    public CitaDTO GetCitaByAgenda(AgendaDTO agenda) {
        return null;
    }

    @Override
    public CitaDTO GetCitaByUsuario(UsuarioDTO usuario) {
        return null;
    }

    @Override
    public CitaDTO GetCitaByEmpleado(EmpleadoDTO empleado) {
        return null;
    }

    @Override
    public CitaDTO GetCitaByEstado(EstadoCitaDTO estadoCita) {
        return null;
    }

    @Override
    public CitaDTO GetCitaByServicio(ServicioDTO servicio) {
        return null;
    }

    @Override
    public List<CitaDTO> getAllCita() {
        return null;
    }
}
