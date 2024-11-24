package org.factoriaf5.peaje;
public class Coche extends Vehiculo {
    public Coche(String placa) {
        super(placa);
    }

    @Override
    public float getPeaje() {
        return 100.0f; // El peaje de un coche es $100
    }
}
