package com.retosincrono.reto.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Cliente {

    @Id
    @Column(nullable = false, updatable = false, name = "PK_ID_CLIENTE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "primary_sequence")
    private Integer id;

    @Column(nullable = false, name = "NOMBRE")
    private String nombre;

    @Column(nullable = false, name = "APELLIDO_PATERNO")
    private String apellidoPaterno;

    @Column(nullable = false, name = "APELLIDO_MATERNO")
    private String apellidoMaterno;

    @CreatedDate
    @Column(nullable = false, length = 10, name = "FECHA_CREACION")
    private LocalDateTime fechaCreacion;

    @Column(nullable = false, length = 10, name = "ACTIVO")
    private Boolean activo;

}
