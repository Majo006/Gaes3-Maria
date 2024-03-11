package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import com.BaiWeb.Bai.entity.Estado_Recordatorio;
import com.BaiWeb.Bai.mapper.Estado_RecordatorioMapper;
import com.BaiWeb.Bai.repository.Estado_RecordatorioRepository;
import com.BaiWeb.Bai.service.Estado_RecordatorioService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Estado_RecordatorioServiceImpl implements Estado_RecordatorioService {
    private Estado_RecordatorioRepository estadoRecordatorioRepository;
    @Override
    public Estado_RecordatorioDTO CreateEstado_Recordatorio(Estado_RecordatorioDTO estado_recordatorioDTO) {
        Estado_Recordatorio estadoRecordatorio = Estado_RecordatorioMapper.mapToEstado_Recordatorio(estado_recordatorioDTO);
        Estado_Recordatorio savedEstado = estadoRecordatorioRepository.save(estadoRecordatorio);
        return Estado_RecordatorioMapper.mapToEstado_RecordatorioDTO(savedEstado);
    }

    @Override
    public Estado_RecordatorioDTO GetEstado_RecordatorioById(Long id) {
        Estado_Recordatorio estadoRecordatorio = estadoRecordatorioRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Estado de Recordatorio not found for id: " + id));
        return Estado_RecordatorioMapper.mapToEstado_RecordatorioDTO(estadoRecordatorio);
    }

    @Override
    public List<Estado_RecordatorioDTO> getAllEstado_Recordatorio() {
        List<Estado_Recordatorio> estadoRecordatorios = estadoRecordatorioRepository.findAll();
        return estadoRecordatorios.stream().map(Estado_RecordatorioMapper::mapToEstado_RecordatorioDTO)
                .collect(Collectors.toList());
    }
}
