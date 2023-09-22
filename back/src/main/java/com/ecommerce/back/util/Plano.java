package com.ecommerce.back.util;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "plano")
public enum Plano {

    PREMIUM,
    BASICO
}
