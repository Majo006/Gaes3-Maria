package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.ServicioDTO;


import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;

public interface ServicioService {

    ServicioDTO CreateServicio(ServicioDTO servicioDTO);

    ServicioDTO getServicioById(Long Id);

    List<ServicioDTO> getAllServicio();
}
