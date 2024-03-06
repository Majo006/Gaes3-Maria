package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.AdministradorDTO;
import com.BaiWeb.Bai.service.AdministradorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/administrador")
@CrossOrigin("*")
public class AdministradorController {
    public AdministradorService administradorService;
    @PostMapping("/add")
    public ResponseEntity<AdministradorDTO>
    createAdministrador(@RequestBody AdministradorDTO administradorDTO){
        AdministradorDTO savedAdministrador=administradorService.CreateAdministrador(administradorDTO);
        return new ResponseEntity<>(savedAdministrador, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<AdministradorDTO>
    getAdministradorById(@PathVariable("id") Long id){
        AdministradorDTO administradorDTO=administradorService.getAdministradorById(id);
        return ResponseEntity.ok(administradorDTO);
    }
    @GetMapping("/all")
    public ResponseEntity<List<AdministradorDTO>>
    getAllAdministrador(){
        List<AdministradorDTO> admi=administradorService.getAllAdministrador();
        return ResponseEntity.ok(admi);
    }
}
