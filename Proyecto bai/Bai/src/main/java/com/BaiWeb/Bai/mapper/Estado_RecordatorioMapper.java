package com.BaiWeb.Bai.mapper;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import com.BaiWeb.Bai.entity.Estado_Recordatorio;

public class Estado_RecordatorioMapper {
    public static Estado_RecordatorioDTO mapToEstado_RecordatorioDTO(Estado_Recordatorio estadoRecordatorio){
        return new Estado_RecordatorioDTO(
                estadoRecordatorio.getId(),
                estadoRecordatorio.getEstado()
        );
    }
    public static Estado_Recordatorio mapToEstado_Recordatorio(Estado_RecordatorioDTO estadoRecordatorioDTO){
        return new Estado_Recordatorio(
                estadoRecordatorioDTO.getId(),
                estadoRecordatorioDTO.getEstado()
        );
    }
}

