package com.retosincrono.reto.controller;

import com.retosincrono.reto.domain.ClientRequestBody;
import com.retosincrono.reto.service.ClientDataService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
@Slf4j
public class ClientController {

    private final ClientDataService clientDataService;

    @GetMapping
    public ResponseEntity<?> getClient() {
        log.info("In getClient.");
        return clientDataService.getClients();
    }

    @PostMapping
    public ResponseEntity<?> postClient(@Valid @RequestBody ClientRequestBody clientRequestBody) {
        log.info("In postClient.");

        return clientDataService.postClient(clientRequestBody);

    }

}
