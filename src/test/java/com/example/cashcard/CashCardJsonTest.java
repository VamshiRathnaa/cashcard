package com.example.cashcard;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;


import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.assertj.core.api.Assertions.assertThat;

public class CashCardJsonTest {

    @Autowired
    private JacksonTester<CashCard> json;

    @Autowired
    private JacksonTester<CashCard[]> jsonList;

    private CashCard[] cashCards;

    @BeforeEach
    void setUp() {
        cashCards = Arrays.array(
                new CashCard(99L, 123.45),
                new CashCard(100L, 100.00),
                new CashCard(101L, 150.00));
    }
@Test
void cashCardListSerializationTest() throws IOException {
        assertThat(jsonList.write((cashCards)).equals("list.json"));
//   assertThat(jsonList.write(cashCards)).isStrictlyEqualToJson("list.json");
}

}
