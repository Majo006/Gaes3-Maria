package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.service.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/empleado")
@CrossOrigin("*")
public class EmpleadoController {
    public EmpleadoService empleadoService;
    @PostMapping("/add")
    public ResponseEntity<EmpleadoDTO>
    createEmpleado(@RequestBody EmpleadoDTO empleadoDTO){
        EmpleadoDTO savedEmpleado=empleadoService.CreateEmpleado(empleadoDTO);
        return new ResponseEntity<>(savedEmpleado, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<EmpleadoDTO>
    getEmpleadoById(@PathVariable("id") Long id){
        EmpleadoDTO empleadoDTO=empleadoService.GetEmpeladoById(id);
        return ResponseEntity.ok(empleadoDTO);
    }
    @GetMapping("/add")
    public ResponseEntity<List<EmpleadoDTO>>
    getAllEmpleado(){
        List<EmpleadoDTO> empleado= empleadoService.getAllEmpleado();
        return ResponseEntity.ok(empleado);
    }
}
