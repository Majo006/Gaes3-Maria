package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.UsuarioDTO;
import com.BaiWeb.Bai.entity.Usuario;
import com.BaiWeb.Bai.mapper.UsuarioMapper;
import com.BaiWeb.Bai.repository.UsuarioRepository;
import com.BaiWeb.Bai.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.mapUsuario(usuarioDTO);
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return  UsuarioMapper.mapToUsuarioDTO(savedUsuario);
    }

    @Override
    public UsuarioDTO getUsuarioById(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Usuario not found for id: " + id));
        return UsuarioMapper.mapToUsuarioDTO(usuario);
    }

    /*    @Override
    public List<RolDTO> getAllRoles() {
        List<Rol> roles = rolRepository.findAll();
        return roles.stream().map(RolMapper::mapToRolDTO)
                .collect(Collectors.toList());
    }
*/
    @Override
    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(UsuarioMapper::mapToUsuarioDTO)
                .collect(Collectors.toList());
    }
}
