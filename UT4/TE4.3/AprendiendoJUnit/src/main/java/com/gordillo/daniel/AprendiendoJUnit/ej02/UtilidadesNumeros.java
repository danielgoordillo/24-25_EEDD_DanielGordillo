package com.gordillo.daniel.AprendiendoJUnit.ej02;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesNumeros {
    // Versión 1.1
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esImpar(int numero) {
        return numero % 2 != 0;
    }

    // Versión 1.2
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static int factorial(int numero) {
        if (numero == 0 || numero == 1) return 1;
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Versión 1.3
    public static int[] devolverDivisores(int numero) {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }

    public static boolean esPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
}