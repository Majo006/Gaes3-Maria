package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.EstadoCitaDTO;
import com.BaiWeb.Bai.service.EstadoCitaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(path = "api/estadoCita")
@CrossOrigin("*")
public class EstadoCitaController {
    private EstadoCitaService estadoCitaService;

    @PostMapping("/add")
    public ResponseEntity<EstadoCitaDTO> createEstadoCita(@RequestBody EstadoCitaDTO estadoCitaDTO){
        EstadoCitaDTO savedEstadoCita=estadoCitaService.CreateEstadoCita(estadoCitaDTO);
        return new ResponseEntity<>(savedEstadoCita, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<EstadoCitaDTO>
    getEstadoCita(@PathVariable("id") Long id){
        EstadoCitaDTO estadoCitaDTO=estadoCitaService.GetEstadoCitaById(id);
        return  ResponseEntity.ok(estadoCitaDTO);
    }
    @GetMapping("/all")
    public ResponseEntity<List<EstadoCitaDTO>>
    getAllEstadoCita(){
        List<EstadoCitaDTO> estado=estadoCitaService.getAllEstadoCita();
        return ResponseEntity.ok(estado);
    }
}
