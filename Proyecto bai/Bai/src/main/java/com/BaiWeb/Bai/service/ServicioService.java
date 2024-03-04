package com.BaiWeb.Bai.service;

import com.BaiWeb.Bai.DTO.ServicioDTO;


import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;

public interface ServicioService {

    ServicioDTO CreateServicio(ServicioDTO servicioDTO);

    ServicioDTO getServicioById(Long Id);

    ServicioDTO GetServicioBynombre(String nombre);
    ServicioDTO GetServicioBydescripcion(String descripcion);
    ServicioDTO GetServicioByduracionaprox(Time duracionaprox);

    ServicioDTO GetServicioByprecioaprox(BigDecimal precioaprox);

    List<ServicioDTO> getAllServicio();
}
