package com.gordillo.daniel.AprendiendoJUnit.ej01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@DisplayName("Test para la clase Fibonacci")
class FibonacciTest {

    private fibonacci calculator;

    @BeforeEach
    void setUp() {
        calculator = new fibonacci();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test @DisplayName("Fibonacci de 0 debe ser 0")
    void testFib0() {
        assertEquals(0, calculator.fib(0));
    }

    @Test @DisplayName("Fibonacci de 1 debe ser 1")
    void testFib1() {
        assertEquals(1, calculator.fib(1));
    }

    @Test @DisplayName("Fibonacci de 2 debe ser 1")
    void testFib2() {
        assertEquals(1, calculator.fib(2));
    }

    @Test @DisplayName("Fibonacci de 3 debe ser 2")
    void testFib3() {
        assertEquals(2, calculator.fib(3));
    }

    @Test @DisplayName("Fibonacci de 4 debe ser 3")
    void testFib4() {
        assertEquals(3, calculator.fib(4));
    }

    @Test @DisplayName("Fibonacci de 5 debe ser 5")
    void testFib5() {
        assertEquals(5, calculator.fib(5));
    }

    @Test @DisplayName("Fibonacci de 8 debe ser 21")
    void testFib8() {
        assertEquals(21, calculator.fib(8));
    }

    @Test @DisplayName("Fibonacci de 10 debe ser 55")
    void testFib10() {
        assertEquals(55, calculator.fib(10));
    }

    @Test @DisplayName("Fibonacci de 13 debe ser 233")
    void testFib13() {
        assertEquals(233, calculator.fib(13));
    }

    @Test @DisplayName("Fibonacci de 15 debe ser 610")
    void testFib15() {
        assertEquals(610, calculator.fib(15));
    }

    @Test @DisplayName("Fibonacci de 20 debe ser 6765")
    void testFib20() {
        assertEquals(6765, calculator.fib(20));
    }

    @Test @DisplayName("Fibonacci de 25 debe ser 75025")
    void testFib25() {
        assertEquals(75025, calculator.fib(25));
    }

    @Test @DisplayName("Fibonacci con número negativo lanza excepción")
    void testFibNegativo() {
        assertThrows(IllegalArgumentException.class, () -> calculator.fib(-1));
    }
}
