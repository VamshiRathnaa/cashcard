package com.example.cashcard;

import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;

record CashCard(@Id Long id, Double amount) {
}
