package com.demo.transacciones.service.impl;

import com.demo.transacciones.dto.TransaccionDTO;
import com.demo.transacciones.entity.Transaccion;
import com.demo.transacciones.repository.TransaccionRepository;
import com.demo.transacciones.service.TransaccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransaccionServiceImpl implements TransaccionService {

    private final TransaccionRepository transaccionRepository;

    @Override
    public TransaccionDTO buscarPorId(Long idTransaccion) {
        Transaccion transaccion = transaccionRepository.findById(idTransaccion)
                .orElseThrow(() -> new RuntimeException("Transacción no encontrada"));
        return TransaccionDTO.builder()
                .idTransaccion(transaccion.getIdTransaccion())
                .descripcion(transaccion.getDescripcion())
                .monto(transaccion.getMonto())
                .build();
    }
}
