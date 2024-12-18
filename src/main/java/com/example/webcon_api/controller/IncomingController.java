package com.example.webcon_api.controller;

import com.example.webcon_api.model.Incoming;
import com.example.webcon_api.repository.IncomingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class IncomingController {

    private final IncomingRepository incomingRepository;

    public IncomingController(IncomingRepository incomingRepository) {
        this.incomingRepository = incomingRepository;
    }

    // Endpoint do pobierania danych o konkretnym id z tabeli incoming
    @GetMapping("/incoming/{id}")
    public Incoming getIncomingById(@PathVariable Long id) {
        Optional<Incoming> incoming = incomingRepository.findById(id);

        if (incoming.isPresent()) {
            return incoming.get();
        } else {
            // Można zwrócić odpowiedź z błędem, jeśli nie znaleziono rekordu
            throw new RuntimeException("Incoming not found for id: " + id);
        }
    }
}
