package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface CitaService {

    CitaDTO CreateCita(CitaDTO citaDTO);
    CitaDTO GetCitaById(Long Id);

    List<CitaDTO> getAllCita();
}
