package com.gordillo.daniel;

public class Cliente {
    private final String nombre;
    private final String nif;

    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente other)) return false;
        return nif.equals(other.nif);
    }

    @Override
    public int hashCode() {
        return nif.hashCode();
    }
}

