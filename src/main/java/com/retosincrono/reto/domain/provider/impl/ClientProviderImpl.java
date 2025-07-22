package com.retosincrono.reto.domain.provider.impl;

import com.retosincrono.reto.domain.ClientRequestBody;
import com.retosincrono.reto.domain.entity.Cliente;
import com.retosincrono.reto.domain.provider.ClienteProvider;
import com.retosincrono.reto.domain.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class ClientProviderImpl implements ClienteProvider {

    private final ClienteRepository clientRepository;

    @Override
    public Cliente create(Cliente cliente) {
        return clientRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clientRepository.findAll();
    }

}
