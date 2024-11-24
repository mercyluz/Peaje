package org.factoriaf5.peaje;
public class Camion extends Vehiculo {
    int numEjes;

    public Camion(String placa, int numEjes) {
        super(placa);
        this.numEjes = numEjes;
    }

    @Override
    public float getPeaje() {
        return 50.0f * numEjes; // $50 por cada eje del camión
    }
}
