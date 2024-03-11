package com.BaiWeb.Bai.service.impl;

import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;
import com.BaiWeb.Bai.controller.EmpleadoController;
import com.BaiWeb.Bai.entity.Empleado;
import com.BaiWeb.Bai.mapper.EmpleadoMapper;
import com.BaiWeb.Bai.repository.EmpleadoRepository;
import com.BaiWeb.Bai.service.EmpleadoService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {
    private EmpleadoRepository empleadoRepository;
    @Override
    public EmpleadoDTO CreateEmpleado(EmpleadoDTO empleadoDTO) {
        Empleado empleado = EmpleadoMapper.mapToEmpleado(empleadoDTO);
        Empleado savedEmpleado = empleadoRepository.save(empleado);
        return EmpleadoMapper.mapToEmpleadoDTO(savedEmpleado);
    }

    @Override
    public EmpleadoDTO GetEmpeladoById(Long id) {
        Empleado empleado = empleadoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Empleado not found for id: " + id));
        return EmpleadoMapper.mapToEmpleadoDTO(empleado);
    }

    @Override
    public List<EmpleadoDTO> getAllEmpleado() {
        List<Empleado> empleados = empleadoRepository.findAll();
        return empleados.stream().map(EmpleadoMapper::mapToEmpleadoDTO)
                .collect(Collectors.toList());
    }
}
