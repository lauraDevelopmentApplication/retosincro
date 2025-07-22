package com.retosincrono.reto.domain.usecase;

import com.retosincrono.reto.domain.entity.Cliente;
import com.retosincrono.reto.domain.provider.ClienteProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteUseCase {

    private final ClienteProvider clienteProvider;

    public Cliente create(Cliente cliente){
        return clienteProvider.create(cliente);
    }

    public List<Cliente> getClientes(){
        return clienteProvider.getAllClientes();
    }
}
