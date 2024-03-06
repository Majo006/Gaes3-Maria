package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.AgendaDTO;
import com.BaiWeb.Bai.service.AgendaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/agenda")
@CrossOrigin("*")
public class AgendaController {
    public AgendaService agendaService;
    @PostMapping("/add")
    public ResponseEntity<AgendaDTO>
    createAgenda(@RequestBody AgendaDTO agendaDTO){
        AgendaDTO savedAgenda=agendaService.CreateAgenda(agendaDTO);
        return new ResponseEntity<>(savedAgenda, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<AgendaDTO>
    getAgendaById(@PathVariable("id") Long id){
        AgendaDTO agendaDTO=agendaService.GetAgendaById(id);
        return ResponseEntity.ok(agendaDTO);
    }
    @GetMapping("/all")
    public ResponseEntity<List<AgendaDTO>>
    getAllAgenda(){
        List<AgendaDTO> agenda=agendaService.getAllAgenda();
        return ResponseEntity.ok(agenda);
    }
}
