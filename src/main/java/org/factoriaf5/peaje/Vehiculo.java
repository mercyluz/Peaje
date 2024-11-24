package org.factoriaf5.peaje;
public abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract float getPeaje();
}

