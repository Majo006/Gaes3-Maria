package com.BaiWeb.Bai.entity;

import com.BaiWeb.Bai.DTO.CitaDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "citaempleados")
public class CitaEmpleado {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_cita")
    private Cita cita;

    public CitaEmpleado(Long id, CitaDTO cita) {
    }
}
