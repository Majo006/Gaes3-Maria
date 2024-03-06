package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.CitaEmpleadoDTO;
import com.BaiWeb.Bai.DTO.EstadoCitaDTO;
import com.BaiWeb.Bai.service.CitaEmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/cintaEmpleado")
@CrossOrigin("*")
public class CitaEmpleadoController {
    private CitaEmpleadoService citaEmpleadoService;
    @PostMapping("/add")
    public ResponseEntity<CitaEmpleadoDTO>
    createCitaEmpleado(@RequestBody CitaEmpleadoDTO citaEmpleadoDTO){
        CitaEmpleadoDTO savedCitaEmpleado=citaEmpleadoService.CreateCitaEmpleado(citaEmpleadoDTO);
        return new ResponseEntity<>(savedCitaEmpleado, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<CitaEmpleadoDTO>
    getCitaEmpleadoById(@PathVariable("id") Long id){
        CitaEmpleadoDTO citaEmpleadoDTO=citaEmpleadoService.GetCitaEmpleadoById(id);
        return ResponseEntity.ok(citaEmpleadoDTO);
    }
    @GetMapping("/all")
    public ResponseEntity<List<CitaEmpleadoDTO>>
    getAllCitaEmpleado(){
        List<CitaEmpleadoDTO> citaE= citaEmpleadoService.getAllCitaEmpleado();
        return ResponseEntity.ok(citaE);
    }
}
