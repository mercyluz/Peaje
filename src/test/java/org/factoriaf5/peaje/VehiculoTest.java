package org.factoriaf5.peaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    private Vehiculo coche;
    private Vehiculo moto;
    private Vehiculo camion;

    @BeforeEach
    public void setUp() {
        coche = new Coche("ABC123");
        moto = new Moto("XYZ456");
        camion = new Camion("LMN789", 3);  // Camión con 3 ejes
    }

    @Test
    public void testPeajeCoche() {
        assertEquals(100.0f, coche.getPeaje(), "El peaje de un coche debe ser $100");
    }

    @Test
    public void testPeajeMoto() {
        assertEquals(50.0f, moto.getPeaje(), "El peaje de una moto debe ser $50");
    }

    @Test
    public void testPeajeCamion() {
        assertEquals(150.0f, camion.getPeaje(), "El peaje de un camión con 3 ejes debe ser $150");
    }

    @Test
    public void testPlacaCoche() {
        assertEquals("ABC123", coche.placa, "La placa del coche debe ser ABC123");
    }

    @Test
    public void testPlacaMoto() {
        assertEquals("XYZ456", moto.placa, "La placa de la moto debe ser XYZ456");
    }

    @Test
    public void testPlacaCamion() {
        assertEquals("LMN789", camion.placa, "La placa del camión debe ser LMN789");
    }

    @Test
    public void testPolimorfismo() {
        // Verificar que se puede tratar a los diferentes tipos de vehículos como "Vehiculo"
        Vehiculo vehiculo1 = new Coche("XYZ111");
        Vehiculo vehiculo2 = new Moto("XYZ222");
        Vehiculo vehiculo3 = new Camion("XYZ333", 4);

        // Verificar que el polimorfismo funcione y devuelva el peaje esperado para cada tipo de vehículo
        assertEquals(100.0f, vehiculo1.getPeaje(), "El peaje de un coche debe ser $100");
        assertEquals(50.0f, vehiculo2.getPeaje(), "El peaje de una moto debe ser $50");
        assertEquals(200.0f, vehiculo3.getPeaje(), "El peaje de un camión con 4 ejes debe ser $200");
    }
}
