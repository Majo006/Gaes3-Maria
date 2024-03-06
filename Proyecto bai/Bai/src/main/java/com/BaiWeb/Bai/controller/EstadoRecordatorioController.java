package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.Estado_RecordatorioDTO;
import com.BaiWeb.Bai.DTO.HistorialTratamientoDTO;
import com.BaiWeb.Bai.service.Estado_RecordatorioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/estadoRecordatorio")
@CrossOrigin("*")
public class EstadoRecordatorioController {
    public Estado_RecordatorioService estadoRecordatorioService;

    @PostMapping("/add")
    public ResponseEntity<Estado_RecordatorioDTO>
    createEstado_Recordatorio(@RequestBody Estado_RecordatorioDTO estadoRecordatorioDTO) {
        Estado_RecordatorioDTO savedEstadoRecordatorio=estadoRecordatorioService.CreateEstado_Recordatorio(estadoRecordatorioDTO);
        return new ResponseEntity<>(savedEstadoRecordatorio, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<Estado_RecordatorioDTO>
    getEstado_Recordatorio(@PathVariable("id")Long id){
        Estado_RecordatorioDTO estadoRecordatorioDTO=estadoRecordatorioService.GetEstado_RecordatorioById(id);
        return ResponseEntity.ok(estadoRecordatorioDTO);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Estado_RecordatorioDTO>>
    getAllEstado_Recordatorio(){
        List<Estado_RecordatorioDTO> estadoR=estadoRecordatorioService.getAllEstado_Recordatorio();
        return ResponseEntity.ok(estadoR);
    }
}
