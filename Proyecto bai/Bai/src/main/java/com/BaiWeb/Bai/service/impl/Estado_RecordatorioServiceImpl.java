package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import com.BaiWeb.Bai.service.Estado_RecordatorioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Estado_RecordatorioServiceImpl implements Estado_RecordatorioService {
    @Override
    public Estado_RecordatorioDTO CreateEstado_Recordatorio(Estado_RecordatorioDTO estado_recordatorioDTO) {
        return null;
    }

    @Override
    public Estado_RecordatorioDTO GetEstado_RecordatorioById(Long Id) {
        return null;
    }

    @Override
    public Estado_RecordatorioDTO GetEstado_RecordatorioByestado(String estado) {
        return null;
    }

    @Override
    public List<Estado_RecordatorioDTO> getAllEstado_Recordatorio() {
        return null;
    }
}
