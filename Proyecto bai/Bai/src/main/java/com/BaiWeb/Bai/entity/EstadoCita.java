package com.BaiWeb.Bai.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "estadoscitas")
public class EstadoCita {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "estado", nullable = false,unique = true,length = 25)
    private String estado;

}
