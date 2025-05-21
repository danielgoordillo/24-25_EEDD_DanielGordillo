package com.gordillo.daniel.AprendiendoJUnit.ej03;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test para UtilidadesTexto")
class UtilidadesTextoTest {

    @Test
    @DisplayName("Test esPalindromo")
    void testEsPalindromo() {
        assertFalse(UtilidadesTexto.esPalindromo("Daniel lava la tina"));
        assertTrue(UtilidadesTexto.esPalindromo("La ruta natural"));
        assertFalse(UtilidadesTexto.esPalindromo("Dábale arroz a la zorra el abad"));
        assertFalse(UtilidadesTexto.esPalindromo("La casa de la montaña"));
        assertFalse(UtilidadesTexto.esPalindromo("El gato de San Roque no tiene rabo"));
    }
    @Test
    @DisplayName("Test contarVocales")
    void testContarVocales() {
        assertEquals(4, UtilidadesTexto.contarVocales("Hola Mundo"));
        assertEquals(5, UtilidadesTexto.contarVocales("Murcielago"));
        assertEquals(22, UtilidadesTexto.contarVocales("En un lugar de la Mancha de cuyo nombre no quiero acordarme"));
        assertEquals(14, UtilidadesTexto.contarVocales("El gato de San Roque no tiene rabo"));
    }
    @Test
    @DisplayName("Test contarConsonantes")
    void testContarConsonantes() {
        assertEquals(5, UtilidadesTexto.contarConsonantes("Hola Mundo"));
        assertEquals(5, UtilidadesTexto.contarConsonantes("Murcielago"));
        assertEquals(26, UtilidadesTexto.contarConsonantes("En un lugar de la Mancha de cuyo nombre no quiero acordarme"));
        assertEquals(13, UtilidadesTexto.contarConsonantes("El gato de San Roque no tiene rabo"));
    }
    @Test
    @DisplayName("Test contarPalabras")
    void testContarPalabras() {
        assertEquals(2, UtilidadesTexto.contarPalabras("Hola Mundo"));
        assertEquals(1, UtilidadesTexto.contarPalabras("Murcielago"));
        assertEquals(12, UtilidadesTexto.contarPalabras("En un lugar de la Mancha de cuyo nombre no quiero acordarme"));
        assertEquals(8, UtilidadesTexto.contarPalabras("El perro de San Roque no tiene rabo"));
        assertEquals(0, UtilidadesTexto.contarPalabras(" "));
    }
    @Test
    @DisplayName("Test contarCaracteres")
    void testContarCaracteres() {
        assertEquals(9, UtilidadesTexto.contarCaracteres("Hola Mundo"));
        assertEquals(10, UtilidadesTexto.contarCaracteres("Murcielago"));
        assertEquals(48, UtilidadesTexto.contarCaracteres("En un lugar de la Mancha de cuyo nombre no quiero acordarme"));
        assertEquals(28, UtilidadesTexto.contarCaracteres("El perro de San Roque no tiene rabo"));
        assertEquals(0, UtilidadesTexto.contarCaracteres(" "));
    }

}






