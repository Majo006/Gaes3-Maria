package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import com.BaiWeb.Bai.DTO.RecordatorioDTO;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface RecordatorioService {
    RecordatorioDTO CreateRecordatorio(RecordatorioDTO recordatorioDTO);
    RecordatorioDTO GetRecordatorioById(Long Id);
    RecordatorioDTO GetRecordatorioByfecha(Date fecha);
    RecordatorioDTO GetRecordatorioByhora(Time hora);
    RecordatorioDTO GetRecordatorioBymensaje(String mensaje);
    RecordatorioDTO GetRecordatorioByEstado_recordatorio(Estado_RecordatorioDTO estado_recordatorio);
    List<RecordatorioDTO> getAllRecordatorio();
}
