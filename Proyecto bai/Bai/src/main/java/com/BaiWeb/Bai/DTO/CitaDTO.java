package com.BaiWeb.Bai.DTO;

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
public class CitaDTO {
    private Long id;
    private Date fecha;
    private Time hora;
    private Boolean confirmación;
    private AgendaDTO agenda;
    private UsuarioDTO usuario;
    private EmpleadoDTO empleado;
    private EstadoCitaDTO estado;
    private ServicioDTO servicios;
}
