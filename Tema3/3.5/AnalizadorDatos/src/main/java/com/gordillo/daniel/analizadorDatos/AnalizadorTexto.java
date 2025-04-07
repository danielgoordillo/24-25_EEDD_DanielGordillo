package com.gordillo.daniel.analizadorDatos;


import com.lavado.gonzalo.UtilidadesTexto;

public class AnalizadorTexto {

    public static void analizar(String texto) {
        System.out.println("📝 Análisis del texto: \"" + texto + "\"");

        System.out.println("¿Es palíndromo? " + (UtilidadesTexto.esPalindromo(texto) ? "✅ Sí" : "❌ No"));
        System.out.println("Número de vocales: " + UtilidadesTexto.contarVocales(texto));
        System.out.println("Número de consonantes: " + UtilidadesTexto.contarConsonantes(texto));
        System.out.println("Número de palabras: " + UtilidadesTexto.contarPalabras(texto));
        System.out.println("Número de caracteres (sin espacios): " + UtilidadesTexto.contarCaracteres(texto));
    }
}
