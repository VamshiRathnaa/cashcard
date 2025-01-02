package com.example.cashcard;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CashCard {
    @Id
    private Long id;
    private Double amount;

    CashCard() {
    }

    CashCard(Long id, Double amount) {
        this.id = id;
        this.amount = amount;
    }
}