package com.BaiWeb.Bai.mapper;

import com.BaiWeb.Bai.DTO.EstadoCitaDTO;
import com.BaiWeb.Bai.entity.EstadoCita;

public class EstadoCitaMapper {
    public static EstadoCitaDTO mapToEstadoCitaDTO(EstadoCita estadoCita){
        return new EstadoCitaDTO(
                estadoCita.getId(),
                estadoCita.getEstado()
        );
    }
    public static EstadoCita mapToEstadoCita(EstadoCitaDTO estadoCitaDTO){
        return new EstadoCita(
                estadoCitaDTO.getId(),
                estadoCitaDTO.getEstado()
        );
    }
}
