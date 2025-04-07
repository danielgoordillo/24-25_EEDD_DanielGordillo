package com.gordillo.daniel.analizadorDatos;

import java.util.ArrayList;
import java.util.List;

public class AnalizadorNumerico {

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean esImpar(int numero) {
        return numero % 2 != 0;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public long factorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public List<Integer> devolverDivisores(int numero) {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) divisores.add(i);
        }
        return divisores;
    }

    public boolean esPerfecto(int numero) {
        List<Integer> divisores = devolverDivisores(numero);
        divisores.remove(divisores.size() - 1); // Eliminar el número mismo
        int sumaDivisores = divisores.stream().mapToInt(Integer::intValue).sum();
        return sumaDivisores == numero;
    }
}

