package com.ecommerce.back.model.entities;

import jakarta.persistence.*;

import java.util.UUID;

@MappedSuperclass
public class Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false, columnDefinition = "CHAR(36)")
    private UUID uuid;

    public Long getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
