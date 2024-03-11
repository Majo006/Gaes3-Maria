package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.AgendaDTO;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface AgendaService {

    AgendaDTO CreateAgenda(AgendaDTO agendaDTO);

    AgendaDTO GetAgendaById(Long Id);

    List<AgendaDTO> getAllAgenda();
}
