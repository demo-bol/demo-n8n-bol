package com.demo.transacciones.controller;

import com.demo.transacciones.dto.TransaccionDTO;
import com.demo.transacciones.service.TransaccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transacciones")
@RequiredArgsConstructor
public class TransaccionController {

    private final TransaccionService transaccionService;

    @GetMapping("/{id}")
    public ResponseEntity<TransaccionDTO> getTransaccion(@PathVariable Long id) {
        return ResponseEntity.ok(transaccionService.buscarPorId(id));
    }
}
