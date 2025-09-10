package com.demo.transacciones.service;

import com.demo.transacciones.dto.TransaccionDTO;

public interface TransaccionService {
    TransaccionDTO buscarPorId(Long idTransaccion);
}
