package com.ecommerce.back.model.entities;

import jakarta.persistence.*;

import java.util.UUID;

@MappedSuperclass
public class Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, length = 10)
    private Long id;
    @Column(nullable = false, updatable = false, columnDefinition = "VARCHAR(36)")
    private String uuid;

    public Long getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
