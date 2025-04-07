package com.gordillo.daniel.analizadorDatos;

public class AnalizadorTexto {

    public boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reverso = new StringBuilder(textoLimpio).reverse().toString();
        return textoLimpio.equals(reverso);
    }

    public int contarVocales(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public int contarConsonantes(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                contador++;
            }
        }
        return contador;
    }

    public int contarPalabras(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

    public int contarCaracteres(String texto) {
        return texto.replaceAll(" ", "").length();
    }
}

