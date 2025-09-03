package com.gordillo.daniel.AprendiendoJUnit.ej03;


public class UtilidadesTexto {

    public static boolean esPalindromo(String texto) {
        if (texto == null) return false;
        String limpio = texto.replaceAll("[\\sáéíóúÁÉÍÓÚüÜñÑ.,;:!?¿¡]", "").toLowerCase();
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }

    public static int contarVocales(String texto) {
        if (texto == null) return 0;
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiouáéíóúü".indexOf(c) != -1) contador++;
        }
        return contador;
    }

    public static int contarConsonantes(String texto) {
        if (texto == null) return 0;
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && !"aeiouáéíóúü".contains(String.valueOf(c))) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) return 0;
        return texto.trim().split("\\s+").length;
    }

    public static int contarCaracteres(String texto) {
        if (texto == null || texto.trim().isEmpty()) return 0;
        return texto.replaceAll("\\s+", "").length();
    }
}

