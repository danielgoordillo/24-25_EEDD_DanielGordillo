package com.gordillo.daniel.analizadorDatos;

import com.lavado.gonzalo.UtilidadesTexto;

public class AnalizadorTexto {

    public boolean esPalindromo(String texto) {
        return UtilidadesTexto.esPalindromo(texto);
    }

    public int contarVocales(String texto) {
        return UtilidadesTexto.contarVocales(texto);
    }

    public int contarConsonantes(String texto) {
        return UtilidadesTexto.contarConsonantes(texto);
    }

    public int contarPalabras(String texto) {
        return UtilidadesTexto.contarPalabras(texto);
    }

    public int contarCaracteres(String texto) {
        return UtilidadesTexto.contarCaracteres(texto);
    }
}

