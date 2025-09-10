package com.demo.transacciones.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransaccionDTO {
    private Long idTransaccion;
    private String descripcion;
    private Double monto;
}
