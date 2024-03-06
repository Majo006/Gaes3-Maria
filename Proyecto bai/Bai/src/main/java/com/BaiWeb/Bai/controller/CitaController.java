package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.CitaDTO;
import com.BaiWeb.Bai.service.CitaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/cita")
@CrossOrigin("*")
public class CitaController {
    public CitaService citaService;
    @PostMapping("/add")
    public ResponseEntity<CitaDTO>
    createCita(@RequestBody CitaDTO citaDTO){
        CitaDTO savedCita=citaService.CreateCita(citaDTO);
        return new ResponseEntity<>(savedCita, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<CitaDTO>
    getCitaById(@PathVariable("id") Long id){
        CitaDTO citaDTO=citaService.GetCitaById(id);
        return ResponseEntity.ok(citaDTO);
    }
    @GetMapping("/all")
    public ResponseEntity<List<CitaDTO>>
    getAllCita(){
        List<CitaDTO> cita=citaService.getAllCita();
        return ResponseEntity.ok(cita);
    }
}
