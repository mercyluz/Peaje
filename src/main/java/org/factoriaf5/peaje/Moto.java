package org.factoriaf5.peaje;
public class Moto extends Vehiculo {
    public Moto(String placa) {
        super(placa);
    }

    @Override
    public float getPeaje() {
        return 50.0f; // El peaje de una moto es $50
    }
}

