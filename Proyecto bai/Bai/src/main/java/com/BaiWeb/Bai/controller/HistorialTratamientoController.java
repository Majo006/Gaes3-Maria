package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.HistorialTratamientoDTO;
import com.BaiWeb.Bai.service.HistorialTratamientoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/historialTratamiento")
@CrossOrigin("*")
public class HistorialTratamientoController {
    private HistorialTratamientoService historialTratamientoService;
    @PostMapping("/add")
    public ResponseEntity<HistorialTratamientoDTO>
    createHistorialTratamiento(@RequestBody HistorialTratamientoDTO historialTratamientoDTO){
        HistorialTratamientoDTO savedHistorialTratamiento=historialTratamientoService.CreateHistorialTratamiento(historialTratamientoDTO);
        return new ResponseEntity<>(savedHistorialTratamiento, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<HistorialTratamientoDTO>
    getHistorialTratamientoById(@PathVariable("id") Long id){
        HistorialTratamientoDTO historialTratamientoDTO=historialTratamientoService.GetHistorialTratamientoById(id);
        return ResponseEntity.ok(historialTratamientoDTO);
    }
    @GetMapping("/all")
    public ResponseEntity<List<HistorialTratamientoDTO>>
    getAllHistorialTratamiento(){
        List<HistorialTratamientoDTO> historial= historialTratamientoService.getAllHistorialTratamiento();
        return ResponseEntity.ok(historial);
    }

}
