package com.gordillo.daniel.analizadorDatos;

import com.lavado.gonzalo.UtilidadesNumeros;

import java.util.List;

public class AnalizadorNumerico {

    public static void analizar(int numero) {
        System.out.println("🔢 Análisis del número: " + numero);

        System.out.println("¿Es par? " + (UtilidadesNumeros.esPar(numero) ? "✅ Sí" : "❌ No"));
        System.out.println("¿Es impar? " + (UtilidadesNumeros.esImpar(numero) ? "✅ Sí" : "❌ No"));
        System.out.println("¿Es primo? " + (UtilidadesNumeros.esPrimo(numero) ? "✅ Sí" : "❌ No"));
        System.out.println("Factorial: " + UtilidadesNumeros.factorial(numero));

        List<Integer> divisores = UtilidadesNumeros.devolverDivisores(numero);
        System.out.println("Divisores: " + divisores);

        System.out.println("¿Es perfecto? " + (UtilidadesNumeros.esPerfecto(numero) ? "✅ Sí" : "❌ No"));
    }
}
