package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.AdministradorDTO;
import com.BaiWeb.Bai.entity.Administrador;
import com.BaiWeb.Bai.mapper.AdministradorMapper;
import com.BaiWeb.Bai.service.AdministradorService;
import com.BaiWeb.Bai.repository.AdminstradorRepository;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AdministradorServiceImpl implements AdministradorService {
    private AdminstradorRepository adminstradorRepository;
    @Override
    public AdministradorDTO CreateAdministrador(AdministradorDTO administradorDTO) {
        Administrador administrador = AdministradorMapper.mapToAdministrador(administradorDTO);
        Administrador savedAdmi = adminstradorRepository.save(administrador);
        return AdministradorMapper.mapToAdministradorDTO(savedAdmi);
    }

    @Override
    public AdministradorDTO getAdministradorById(Long id) {
        Administrador administrador = adminstradorRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Administrador not found for id: " + id));
        return AdministradorMapper.mapToAdministradorDTO(administrador);
    }

    @Override
    public List<AdministradorDTO> getAllAdministrador() {
        List<Administrador> administradors = adminstradorRepository.findAll();
        return administradors.stream().map(AdministradorMapper::mapToAdministradorDTO)
                .collect(Collectors.toList());
    }
}
