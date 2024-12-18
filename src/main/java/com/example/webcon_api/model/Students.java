package com.example.webcon_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
@IdClass(StudentsId.class) // Użycie złożonego klucza głównego
public class Students {

    @Id
    @Column(name = "index", nullable = false)
    private String index;

    @Id
    @Column(name = "address", nullable = false)
    private String address;

    // Gettery i settery
    public String getIndex() {
        return index;
    }

    public String getAddress() {
        return address;
    }
}
