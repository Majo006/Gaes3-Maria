package com.BaiWeb.Bai.entity;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "recordatorios")
public class Recordatorio {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @Column(name = "hora", nullable = false)
    private Time hora;
    @Column(name = "mensaje", nullable = false, length = 200)
    private String mensaje;

    @OneToOne
    @JoinColumn(name = "fk_estadoRecordatorio")
    private Estado_Recordatorio estadoRecordatorio;

    public Recordatorio(Long id, Date fecha, Time hora, String mensaje, Estado_RecordatorioDTO estado) {
    }
    // otros campos y métodos
}
