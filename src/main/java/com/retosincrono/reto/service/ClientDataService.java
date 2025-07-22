package com.retosincrono.reto.service;


import com.retosincrono.reto.domain.ClientRequestBody;
import org.springframework.http.ResponseEntity;

public interface ClientDataService {

    ResponseEntity<?> getClients();

    ResponseEntity<?> postClient(ClientRequestBody clientRequestBody);

}
