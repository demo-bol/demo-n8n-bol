package com.demo.transacciones.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transacciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaccion")
    private Long idTransaccion;

    private String descripcion;

    private Double monto;
}
