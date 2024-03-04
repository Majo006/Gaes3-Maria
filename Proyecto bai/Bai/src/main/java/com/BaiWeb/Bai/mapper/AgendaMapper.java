package com.BaiWeb.Bai.mapper;

import com.BaiWeb.Bai.DTO.AgendaDTO;
import com.BaiWeb.Bai.entity.Agenda;

public class AgendaMapper {
    public static AgendaDTO mapToAgendaDTO(Agenda agenda){
        return new AgendaDTO(
                agenda.getId(),
                agenda.getFecha(),
                agenda.getHora()
        );
    }
    public static Agenda mapToAgenda(AgendaDTO agendaDTO){
        return new Agenda(
                agendaDTO.getId(),
                agendaDTO.getFecha(),
                agendaDTO.getHora()
        );
    }
}
