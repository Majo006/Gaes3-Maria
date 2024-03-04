package com.BaiWeb.Bai.DTO;

import com.BaiWeb.Bai.entity.Estado_Recordatorio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecordatorioDTO {
    private Long id;
    private Date fecha;
    private Time hora;
    private String mensaje;

    private Estado_RecordatorioDTO estado;

    public RecordatorioDTO(Long id, Date fecha, Time hora, String mensaje, Estado_Recordatorio estadoRecordatorio) {
    }
}
