package com.gordillo.daniel.analizadorDatos;

import com.lavado.gonzalo.UtilidadesNumeros;

import java.util.ArrayList;
import java.util.List;

public class AnalizadorNumerico {

    public boolean esPar(int numero) {
        return UtilidadesNumeros.esPar(numero);
    }

    public boolean esImpar(int numero) {
        return UtilidadesNumeros.esImpar(numero);
    }

    public boolean esPrimo(int numero) {
        return UtilidadesNumeros.esPrimo(numero);

    }


    public long factorial(int numero) {
        return (long) UtilidadesNumeros.factorial(numero);
    }

    public List<Integer> devolverDivisores(int numero) {
        return UtilidadesNumeros.devolverDivisores(numero);
    }

    public boolean esPerfecto(int numero) {
        return UtilidadesNumeros.esPerfecto(numero);
    }

}

