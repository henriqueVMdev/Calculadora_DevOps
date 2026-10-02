package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest {
        // anotação para dizer que é uma função de teste
        Calculadora calculadora = new Calculadora();

        @Test 
        void testarSoma(){
            int resultado = calculadora.somar(3, 2);
            //metodo comparação de resultado
            assertEquals(5, resultado);
        }
        @Test
        void testarMultiplicaçao(){
            int resultado = calculadora.multiplicar(3, 2);
            assertEquals(6, resultado);
        }
        @Test
        void testarDivisao(){
            double resultado = calculadora.dividir(4.0, 2.0);
            assertEquals(2.0, resultado);
        }
}
 
