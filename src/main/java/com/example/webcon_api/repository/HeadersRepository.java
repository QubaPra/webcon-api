package com.example.webcon_api.repository;

import com.example.webcon_api.model.Headers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeadersRepository extends JpaRepository<Headers, Long> {

    // Wyszukiwanie wiadomości, które zawierają e-mail w kolumnach 'from' lub 'to'
    List<Headers> findByFromInOrToIn(List<String> fromEmails, List<String> toEmails);
}
