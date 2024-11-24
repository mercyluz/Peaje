package org.factoriaf5.peaje;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstaciondePeajeTest {

    private EstaciondePeaje estacion;
    private Vehiculo coche;
    private Vehiculo moto;
    private Vehiculo camion;

    @BeforeEach
    public void setUp() {
        estacion = new EstaciondePeaje("Peaje Central", "Madrid");
        coche = new Coche("ABC123");
        moto = new Moto("XYZ456");
        camion = new Camion("LMN789", 3); // Camión con 3 ejes
    }

    @Test
    public void testCalcularPeajeCoche() {
        estacion.calcularPeaje(coche);
        estacion.imprimirReporte();
        // Se espera que el peaje del coche sea 100
        assertEquals(100.0f, estacion.totalRecaudado, "El peaje del coche debe ser 100");
    }

    @Test
    public void testCalcularPeajeMoto() {
        estacion.calcularPeaje(moto);
        estacion.imprimirReporte();
        // Se espera que el peaje de la moto sea 50
        assertEquals(50.0f, estacion.totalRecaudado, "El peaje de la moto debe ser 50");
    }

    @Test
    public void testCalcularPeajeCamion() {
        estacion.calcularPeaje(camion);
        estacion.imprimirReporte();
        // Se espera que el peaje del camión sea 50 * 3 = 150
        assertEquals(150.0f, estacion.totalRecaudado, "El peaje del camión debe ser 150");
    }

    @Test
    public void testReporteTotalRecaudado() {
        // Calculamos el peaje de varios vehículos
        estacion.calcularPeaje(coche);
        estacion.calcularPeaje(moto);
        estacion.calcularPeaje(camion);

        // Se espera que el total recaudado sea 100 (coche) + 50 (moto) + 150 (camión) = 300
        assertEquals(300.0f, estacion.totalRecaudado, "El total recaudado debe ser 300");
    }
}
