package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.ServicioDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;
import com.BaiWeb.Bai.service.ServicioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.geom.QuadCurve2D;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/servicio")
@CrossOrigin("*")
public class ServicioController {
    private ServicioService servicioService;
    @PostMapping("(/add")
    public ResponseEntity<ServicioDTO>
    createServicio(@RequestBody ServicioDTO servicioDTO){
        ServicioDTO savedServicio = servicioService.CreateServicio(servicioDTO);
        return new ResponseEntity<>(savedServicio, HttpStatus.CREATED);
    }
    @GetMapping ("/id")
    public ResponseEntity<ServicioDTO>
    getServicioById(@PathVariable("id") Long id){
        ServicioDTO servicioDTO=servicioService.getServicioById(id);
        return ResponseEntity.ok(servicioDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ServicioDTO>>
    getAllServicio(){
        List<ServicioDTO> servicio = servicioService.getAllServicio();
        return ResponseEntity.ok(servicio);
    }


}
