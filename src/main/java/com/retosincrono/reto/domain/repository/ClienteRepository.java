package com.retosincrono.reto.domain.repository;

import com.retosincrono.reto.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
