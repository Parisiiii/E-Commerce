package com.ecommerce.back.util;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "status")
public enum Status {
    ABERTO,
    FECHADO,
    PENDENTE
}
