package com.example.webcon_api.repository;

import com.example.webcon_api.model.Incoming;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface IncomingRepository extends JpaRepository<Incoming, Long> {
    Optional<Incoming> findById(Long id);
}
