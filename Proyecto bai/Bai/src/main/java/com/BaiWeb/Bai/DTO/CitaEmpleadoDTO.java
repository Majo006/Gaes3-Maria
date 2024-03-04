package com.BaiWeb.Bai.DTO;

import com.BaiWeb.Bai.entity.Cita;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CitaEmpleadoDTO {
    private Long id;
    private CitaDTO cita;

    public CitaEmpleadoDTO(Long id, Cita cita) {
    }
}
