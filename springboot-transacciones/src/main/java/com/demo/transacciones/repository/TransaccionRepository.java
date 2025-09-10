package com.demo.transacciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.transacciones.entity.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
}
