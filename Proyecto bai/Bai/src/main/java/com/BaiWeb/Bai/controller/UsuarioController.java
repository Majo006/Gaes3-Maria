package com.BaiWeb.Bai.controller;

import com.BaiWeb.Bai.DTO.UsuarioDTO;
import com.BaiWeb.Bai.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/usuario")
@CrossOrigin("*")
public class UsuarioController {
    private UsuarioService usuarioService;
    @PostMapping("/add")
    public ResponseEntity<UsuarioDTO>
    createUsuario(@RequestBody UsuarioDTO usuarioDTO){
        UsuarioDTO savedUsuario = usuarioService.createUsuario(usuarioDTO);
        return new ResponseEntity<>(savedUsuario, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<UsuarioDTO>
    getUsuarioById(@PathVariable("id") Long id){
        UsuarioDTO usuarioDTO=usuarioService.getUsuarioById(id);
        return ResponseEntity.ok(usuarioDTO);
    }


    @GetMapping("/all")
    public ResponseEntity<List<UsuarioDTO>>
    getAllUsuario(){
       List<UsuarioDTO> usuario = usuarioService.getAllUsuarios();
        return ResponseEntity.ok(usuario);
    }
}
