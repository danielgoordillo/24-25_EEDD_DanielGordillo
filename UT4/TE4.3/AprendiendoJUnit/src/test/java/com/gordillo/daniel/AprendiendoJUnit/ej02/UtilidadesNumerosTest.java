package com.gordillo.daniel.AprendiendoJUnit.ej02;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@DisplayName("Test para la clase UtilidadesNumeros")
public class UtilidadesNumerosTest {

    @Test
    @DisplayName("Test esPar")
    void testEsPar() {
        assertTrue(UtilidadesNumeros.esPar(0));
        assertFalse(UtilidadesNumeros.esPar(1));
        assertTrue(UtilidadesNumeros.esPar(4));
        assertFalse(UtilidadesNumeros.esPar(5));
    }

    @Test
    @DisplayName("Test esImpar")
    void testEsImpar() {
        assertFalse(UtilidadesNumeros.esImpar(0));
        assertTrue(UtilidadesNumeros.esImpar(5));
        assertFalse(UtilidadesNumeros.esImpar(6));
        assertTrue(UtilidadesNumeros.esImpar(7));
    }

    @Test
    @DisplayName("Test esPrimo")
    void testEsPrimo() {
        assertFalse(UtilidadesNumeros.esPrimo(0));
        assertFalse(UtilidadesNumeros.esPrimo(1));
        assertTrue(UtilidadesNumeros.esPrimo(2));
        assertTrue(UtilidadesNumeros.esPrimo(3));
        assertFalse(UtilidadesNumeros.esPrimo(4));
        assertTrue(UtilidadesNumeros.esPrimo(5));
    }

    @Test
    @DisplayName("Test esPerfecto")
    void testEsPerfecto() {
        assertFalse(UtilidadesNumeros.esPerfecto(0));
        assertFalse(UtilidadesNumeros.esPerfecto(5));
        assertTrue(UtilidadesNumeros.esPerfecto(6));
        assertFalse(UtilidadesNumeros.esPerfecto(9));
        assertFalse(UtilidadesNumeros.esPerfecto(10));
        assertTrue(UtilidadesNumeros.esPerfecto(28));
        assertTrue(UtilidadesNumeros.esPerfecto(496));
    }

    @Test
    @DisplayName("Test factorial")
    void testFactorial() {
        assertThrows(IllegalArgumentException.class, () -> UtilidadesNumeros.factorial(-1));
        assertEquals(1, UtilidadesNumeros.factorial(0));
        assertEquals(1, UtilidadesNumeros.factorial(1));
        assertEquals(2, UtilidadesNumeros.factorial(2));
        assertEquals(6, UtilidadesNumeros.factorial(3));
        assertEquals(120, UtilidadesNumeros.factorial(5));
        assertEquals(3628800, UtilidadesNumeros.factorial(10));
    }

    @Test
    @DisplayName("Test devolverDivisores")
    void testDevolverDivisores() {
        assertArrayEquals(new int[]{}, UtilidadesNumeros.devolverDivisores(0));
        assertArrayEquals(new int[]{1}, UtilidadesNumeros.devolverDivisores(1));
        assertArrayEquals(new int[]{1, 2}, UtilidadesNumeros.devolverDivisores(2));
        assertArrayEquals(new int[]{1, 3}, UtilidadesNumeros.devolverDivisores(3));
        assertArrayEquals(new int[]{1, 2, 4}, UtilidadesNumeros.devolverDivisores(4));
        assertArrayEquals(new int[]{1, 5}, UtilidadesNumeros.devolverDivisores(5));
    }

}
