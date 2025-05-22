package com.gordillo.daniel;


public class Cuenta {
    private final Cliente titular;
    private final String numeroCuenta;
    private double saldo;
    private boolean activa;

    public Cuenta(Cliente titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.activa = true;
    }

    public Cliente getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean estaActiva() {
        return activa;
    }

    public void agregarImporte(double importe) {
        if (!activa) throw new IllegalStateException("Cuenta inactiva");
        if (importe < 0) throw new IllegalArgumentException("Importe negativo");
        saldo += importe;
    }

    public void retirarImporte(double importe) {
        if (!activa) throw new IllegalStateException("Cuenta inactiva");
        if (importe < 0 || importe > saldo) throw new IllegalArgumentException("Importe inválido");
        saldo -= importe;
    }

    public void cerrar() {
        if (saldo != 0) throw new IllegalStateException("No se puede cerrar la cuenta con saldo diferente de 0");
        activa = false;
    }
}

