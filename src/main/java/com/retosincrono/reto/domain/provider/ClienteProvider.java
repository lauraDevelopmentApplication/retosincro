package com.retosincrono.reto.domain.provider;

import com.retosincrono.reto.domain.entity.Cliente;

import java.util.List;

public interface ClienteProvider {
    Cliente create(Cliente cliente);

    List<Cliente> getAllClientes();
}
