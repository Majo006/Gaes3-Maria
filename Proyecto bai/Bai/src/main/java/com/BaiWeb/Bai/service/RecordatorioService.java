package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import com.BaiWeb.Bai.DTO.RecordatorioDTO;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface RecordatorioService {
    RecordatorioDTO CreateRecordatorio(RecordatorioDTO recordatorioDTO);
    RecordatorioDTO GetRecordatorioById(Long Id);
    List<RecordatorioDTO> getAllRecordatorio();
}
