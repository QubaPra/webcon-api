package com.example.webcon_api.controller;

import com.example.webcon_api.model.Headers;
import com.example.webcon_api.repository.HeadersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/headers")
public class HeadersController {

    private final HeadersRepository repository;

    public HeadersController(HeadersRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{emails}")
    public List<Headers> getByEmails(@PathVariable String emails) {
        // Usuwamy nawiasy klamrowe i dzielimy tekst na listę emaili
        List<String> emailList = Arrays.stream(emails.replaceAll("[{}]", "").split(","))
                                       .map(String::trim)
                                       .collect(Collectors.toList());
        return repository.findByFromInOrToIn(emailList, emailList);
    }
    
    @GetMapping
    public List<Headers> getAll() {
        return repository.findAll();
    }
}
