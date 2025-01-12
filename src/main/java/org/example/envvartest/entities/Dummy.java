package org.example.envvartest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dummy {
    public Dummy(String name) {
        this.name = name;
    }

    public Dummy() {
    }

    @Id
    @Column(nullable = false)
    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "name='" + name + '\'' +
                '}';
    }
}
