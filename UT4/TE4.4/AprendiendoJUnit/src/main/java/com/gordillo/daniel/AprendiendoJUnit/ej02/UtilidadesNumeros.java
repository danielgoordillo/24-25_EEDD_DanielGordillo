package com.gordillo.daniel.AprendiendoJUnit.ej02;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesNumeros {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esImpar(int numero) {
        return !esPar(numero);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static boolean esPerfecto(int numero) {
        if (numero <= 0) return false;
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) suma += i;
        }
        return suma == numero;
    }

    public static int factorial(int numero) {
        if (numero < 0) throw new IllegalArgumentException("El número no puede ser negativo");
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int[] devolverDivisores(int numero) {
        if (numero <= 1) return new int[]{};
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores.stream().mapToInt(i -> i).toArray();
    }
}

