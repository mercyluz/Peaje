package org.factoriaf5.peaje;
import java.util.ArrayList;
import java.util.List;

public class EstaciondePeaje {
    private String nombre;
    private String ciudad;
    float totalRecaudado;
    private List<Vehiculo> vehiculos;

    public EstaciondePeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void calcularPeaje(Vehiculo vehiculo) {
        float peaje = vehiculo.getPeaje();
        totalRecaudado += peaje;
        vehiculos.add(vehiculo);
    }

    public void imprimirReporte() {
        System.out.println("Estación de Peaje: " + nombre + " - " + ciudad);
        System.out.println("Total recaudado: $" + totalRecaudado);
        System.out.println("Vehículos que pasaron por la estación:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Placa: " + vehiculo.placa + " - Peaje: $" + vehiculo.getPeaje());
        }
    }
}
