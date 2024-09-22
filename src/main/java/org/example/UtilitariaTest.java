package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UtilitariaTest {

    @Test
    public void testSoma() {
        int resultado = Utilitaria.Calculadora.soma(2, 3);
        assertEquals(5, resultado, "A soma de 2 + 3 deveria ser 5.");
    }
}

class Utilitaria {

    public static class Calculadora {
        public static int soma(int a, int b) {
            return a + b;
        }
    }
}
