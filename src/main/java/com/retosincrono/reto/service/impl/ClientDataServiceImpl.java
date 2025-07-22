package com.retosincrono.reto.service.impl;

import com.retosincrono.reto.domain.ClientRequestBody;
import com.retosincrono.reto.domain.entity.Cliente;
import com.retosincrono.reto.domain.usecase.ClienteUseCase;
import com.retosincrono.reto.service.ClientDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ClientDataServiceImpl implements ClientDataService {

    private final ClienteUseCase clienteUseCase;

    public ClientDataServiceImpl(ClienteUseCase clienteUseCase) {
        this.clienteUseCase = clienteUseCase;
    }

    @Override
    public ResponseEntity<?> getClients() {

        return ResponseEntity.ok(clienteUseCase.getClientes());
    }

    @Override
    public ResponseEntity<?> postClient(ClientRequestBody clientRequestBody) {

        Cliente cliente = new Cliente();
        cliente.setActivo(clientRequestBody.getIsActive());
        cliente.setNombre(clientRequestBody.getName());
        cliente.setApellidoPaterno(clientRequestBody.getFatherLastName());
        cliente.setApellidoMaterno(clientRequestBody.getMotherLastName());

        return ResponseEntity.ok(clienteUseCase.create(cliente));
    }
}
