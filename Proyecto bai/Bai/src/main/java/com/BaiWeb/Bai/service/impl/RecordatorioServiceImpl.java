package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import com.BaiWeb.Bai.DTO.RecordatorioDTO;
import com.BaiWeb.Bai.service.RecordatorioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class RecordatorioServiceImpl implements RecordatorioService {
    @Override
    public RecordatorioDTO CreateRecordatorio(RecordatorioDTO recordatorioDTO) {
        return null;
    }

    @Override
    public RecordatorioDTO GetRecordatorioById(Long Id) {
        return null;
    }

    @Override
    public RecordatorioDTO GetRecordatorioByfecha(Date fecha) {
        return null;
    }

    @Override
    public RecordatorioDTO GetRecordatorioByhora(Time hora) {
        return null;
    }

    @Override
    public RecordatorioDTO GetRecordatorioBymensaje(String mensaje) {
        return null;
    }

    @Override
    public RecordatorioDTO GetRecordatorioByEstado_recordatorio(Estado_RecordatorioDTO estado_recordatorio) {
        return null;
    }

    @Override
    public List<RecordatorioDTO> getAllRecordatorio() {
        return null;
    }
}
