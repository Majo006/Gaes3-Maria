package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.AgendaDTO;
import com.BaiWeb.Bai.service.AgendaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class AgendaServiceImpl implements AgendaService {
    @Override
    public AgendaDTO CreateAgenda(AgendaDTO agendaDTO) {
        return null;
    }

    @Override
    public AgendaDTO GetAgendaById(Long Id) {
        return null;
    }

    @Override
    public AgendaDTO GetAgendaByfecha(Date fecha) {
        return null;
    }

    @Override
    public AgendaDTO GetAgendaByhora(Time hora) {
        return null;
    }

    @Override
    public List<AgendaDTO> getAllAgenda() {
        return null;
    }
}
