package com.BaiWeb.Bai.entity;

import com.BaiWeb.Bai.DTO.CitaDTO;
import com.BaiWeb.Bai.DTO.EmpleadoDTO;
import com.BaiWeb.Bai.DTO.UsuarioDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "HistorialTratamientos")
public class HistorialTratamiento {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

   @ManyToMany
    @JoinTable(
            name = "Historial_citas",
            joinColumns = @JoinColumn(name = "HistorialTratamiento_id"),
            inverseJoinColumns = @JoinColumn(name = "cita_id"))
    private Set<Cita> cita = new HashSet<>();
    // otros campos y métodos

    @ManyToOne
    @JoinColumn (name = "fk_usuario")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
            name = "empleado_historial",
            joinColumns = @JoinColumn(name = "HistorialTratamiento_id"),
            inverseJoinColumns = @JoinColumn(name = "empleado_id"))
    private Set<Empleado> empleados = new HashSet<>();

    public HistorialTratamiento(Long id, CitaDTO cita, UsuarioDTO usuario, EmpleadoDTO empleado) {
    }
    // otros campos y métodos

}
