package com.gordillo.daniel;

import java.util.*;

public class Banco {
    private final String nombre;
    private final Map<String, Cuenta> cuentas = new HashMap<>();
    private final Map<String, String> clientesACuentas = new HashMap<>();
    private int contadorCuenta = 1000;

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta abrirCuenta(Cliente cliente) {
        if (clientesACuentas.containsKey(cliente.getNif())) {
            throw new IllegalArgumentException("El cliente ya tiene una cuenta");
        }

        String numeroCuenta = generarNumeroCuenta();
        Cuenta cuenta = new Cuenta(cliente, numeroCuenta);
        cuentas.put(numeroCuenta, cuenta);
        clientesACuentas.put(cliente.getNif(), numeroCuenta);
        return cuenta;
    }

    public void cerrarCuenta(String numeroCuenta) {
        Cuenta cuenta = obtenerCuenta(numeroCuenta);
        cuenta.cerrar();
        cuentas.remove(numeroCuenta);
        clientesACuentas.remove(cuenta.getTitular().getNif());
    }

    public void transferir(String origen, String destino, double importe) {
        Cuenta cuentaOrigen = obtenerCuenta(origen);
        Cuenta cuentaDestino = obtenerCuenta(destino);

        if (cuentaOrigen.getTitular().equals(cuentaDestino.getTitular())) {
            throw new IllegalArgumentException("El titular de origen y destino no puede ser el mismo");
        }

        cuentaOrigen.retirarImporte(importe);
        cuentaDestino.agregarImporte(importe);
    }

    public Cuenta obtenerCuenta(String numeroCuenta) {
        Cuenta cuenta = cuentas.get(numeroCuenta);
        if (cuenta == null) throw new NoSuchElementException("Cuenta no encontrada");
        return cuenta;
    }

    private String generarNumeroCuenta() {
        return "ES" + (contadorCuenta++);
    }
}
