package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;

import java.util.List;

public interface Estado_RecordatorioService {
    Estado_RecordatorioDTO CreateEstado_Recordatorio(Estado_RecordatorioDTO estado_recordatorioDTO);
    Estado_RecordatorioDTO GetEstado_RecordatorioById(Long Id);
    Estado_RecordatorioDTO GetEstado_RecordatorioByestado(String estado);
    List<Estado_RecordatorioDTO> getAllEstado_Recordatorio();
}
