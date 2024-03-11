package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.AgendaDTO;
import com.BaiWeb.Bai.entity.Agenda;
import com.BaiWeb.Bai.mapper.AgendaMapper;
import com.BaiWeb.Bai.repository.AgendaRepository;
import com.BaiWeb.Bai.service.AgendaService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AgendaServiceImpl implements AgendaService {
    private AgendaRepository agendaRepository;
    @Override
    public AgendaDTO CreateAgenda(AgendaDTO agendaDTO) {
        Agenda agenda = AgendaMapper.mapToAgenda(agendaDTO);
        Agenda savedAgenda = agendaRepository.save(agenda);
        return AgendaMapper.mapToAgendaDTO(savedAgenda);
    }

    @Override
    public AgendaDTO GetAgendaById(Long id) {
        Agenda agenda = agendaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Agenda not found for id: " + id));
        return AgendaMapper.mapToAgendaDTO(agenda);
    }

    @Override
    public List<AgendaDTO> getAllAgenda() {
        List<Agenda> agendas = agendaRepository.findAll();
        return agendas.stream().map(AgendaMapper::mapToAgendaDTO)
                .collect(Collectors.toList());
    }
}
