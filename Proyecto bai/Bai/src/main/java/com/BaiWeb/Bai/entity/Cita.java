package com.BaiWeb.Bai.entity;

import com.BaiWeb.Bai.DTO.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @Column(name = "hora", nullable = false, unique = true)
    private Time hora;
    @Column(name = "confirmacion", nullable = true,unique = false)
    private Boolean confirmacion;


    @ManyToMany
    @JoinTable(
            name = "cita_agenda",
            joinColumns = @JoinColumn(name = "agenda_id"),
            inverseJoinColumns = @JoinColumn(name = "cita_id"))
    private Set<Agenda> agenda = new HashSet<>();
    // otros campos y métodos

    @ManyToMany
    @JoinTable(
            name = "usuarios_citas",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "cita_id"))
    private Set<Usuario> usuario = new HashSet<>();
    // otros campos y métodos


    @ManyToMany
    @JoinTable(
            name = "empleado_citas",
            joinColumns = @JoinColumn(name = "empleado_id"),
            inverseJoinColumns = @JoinColumn(name = "cita_id"))
    private Set<Empleado> empleado = new HashSet<>();
    // otros campos y métodos

    @ManyToMany
    @JoinTable(
            name = "estado_cita",
            joinColumns = @JoinColumn(name = "estadocita_id"),
            inverseJoinColumns = @JoinColumn(name = "cita_id"))
    private Set<EstadoCita> estado = new HashSet<>();
    // otros campos y métodos

    @ManyToMany
    @JoinTable(
            name = "servicios_citas",
            joinColumns = @JoinColumn(name = "servicio_id"),
            inverseJoinColumns = @JoinColumn(name = "cita_id"))
    private Set<Servicio> servicios = new HashSet<>();

    public Cita(Long id, Date fecha, Time hora, Boolean confirmación, AgendaDTO agenda, UsuarioDTO usuario, EmpleadoDTO empleado, EstadoCitaDTO estado, ServicioDTO servicios) {
    }
    // otros campos y métodos



}
