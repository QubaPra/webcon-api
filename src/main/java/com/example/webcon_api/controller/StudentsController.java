package com.example.webcon_api.controller;

import com.example.webcon_api.repository.StudentsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentsController {

    private final StudentsRepository repository;

    public StudentsController(StudentsRepository repository) {
        this.repository = repository;
    }

    // Query for getting all email addresses associated with a given email address or index
    @GetMapping("/{parameter}")
    public List<String> getEmailsByParameter(@PathVariable String parameter) {
        return repository.findEmailsByAddressOrIndex(parameter);
    }
}
