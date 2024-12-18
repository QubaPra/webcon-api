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

    // Query for getting all email addresses associated with a given address
    @GetMapping("/address/{address}")
    public List<String> getEmailsByAddress(@PathVariable String address) {
        return repository.findEmailsByAddress(address);
    }

    // Query for getting all email addresses associated with a given index
    @GetMapping("/index/{index}")
    public List<String> getEmailsByIndex(@PathVariable String index) {
        return repository.findEmailsByIndex(index);
    }
}
