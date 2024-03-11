package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import com.BaiWeb.Bai.DTO.RecordatorioDTO;
import com.BaiWeb.Bai.entity.Recordatorio;
import com.BaiWeb.Bai.mapper.RecordatorioMapper;
import com.BaiWeb.Bai.repository.RecordatorioRepository;
import com.BaiWeb.Bai.service.RecordatorioService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RecordatorioServiceImpl implements RecordatorioService {
    private RecordatorioRepository recordatorioRepository;
    @Override
    public RecordatorioDTO CreateRecordatorio(RecordatorioDTO recordatorioDTO) {
        Recordatorio recordatorio = RecordatorioMapper.mapToRecordatorio(recordatorioDTO);
        Recordatorio savedRecordatorio = recordatorioRepository.save(recordatorio);
        return RecordatorioMapper.mapToRecordatorioDTO(savedRecordatorio);
    }

    @Override
    public RecordatorioDTO GetRecordatorioById(Long id) {
        Recordatorio recordatorio = recordatorioRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Recordatorio not found for id: "+ id));
        return RecordatorioMapper.mapToRecordatorioDTO(recordatorio);
    }

    @Override
    public List<RecordatorioDTO> getAllRecordatorio() {
        List<Recordatorio> recordatorios = recordatorioRepository.findAll();
        return recordatorios.stream().map(RecordatorioMapper::mapToRecordatorioDTO)
                .collect(Collectors.toList());
    }
}
