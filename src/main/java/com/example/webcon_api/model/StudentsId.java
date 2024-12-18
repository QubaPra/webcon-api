package com.example.webcon_api.model;

import java.io.Serializable;
import java.util.Objects;

public class StudentsId implements Serializable {

    private String index;
    private String address;

    public StudentsId() {}

    public StudentsId(String index, String address) {
        this.index = index;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsId that = (StudentsId) o;
        return Objects.equals(index, that.index) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, address);
    }
}
