package com.BaiWeb.Bai.mapper;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import com.BaiWeb.Bai.DTO.RecordatorioDTO;
import com.BaiWeb.Bai.entity.Estado_Recordatorio;
import com.BaiWeb.Bai.entity.Recordatorio;

import java.util.Set;

public class RecordatorioMapper {
    public static RecordatorioDTO mapToRecordatorioDTO(Recordatorio recordatorio){
        return new RecordatorioDTO(
                recordatorio.getId(),
                recordatorio.getFecha(),
                recordatorio.getHora(),
                recordatorio.getMensaje(),
                recordatorio.getEstadoRecordatorio()
        );
    }
    public static Recordatorio mapToRecordatorio(RecordatorioDTO recordatorioDTO){
        return new Recordatorio(
                recordatorioDTO.getId(),
                recordatorioDTO.getFecha(),
                recordatorioDTO.getHora(),
                recordatorioDTO.getMensaje(),
                recordatorioDTO.getEstado()
        );
    }
}
