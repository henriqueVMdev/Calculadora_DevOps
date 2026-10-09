package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CalcIMCTest {
    CalculadoraIMC calcImc = new CalculadoraIMC();

    @Test
    void testarIMC(){
        double resultado = calcImc.calcularImc(70, 1.7);
        assertEquals(24.22, resultado,0.5);
    }
}
