package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest {
        // anotação para dizer que é uma função de teste
    @Test
    void testarSoma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3, 2);
        //metodo assert 
        assertEquals(5, resultado);
    }
    @Test 
    void testarMultiplicacao(){
        Calculadora calculadora = new Calculadora();
        int resultadoM = calculadora.multiplicar(3, 2);
        assertEquals(6, resultadoM);
    }
}
 
