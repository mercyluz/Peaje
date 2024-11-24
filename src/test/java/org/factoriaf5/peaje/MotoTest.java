package org.factoriaf5.peaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotoTest {

    private Moto moto;

    @BeforeEach
    public void setUp() {
        moto = new Moto("XYZ456");  // Inicializamos una moto con una placa
    }

    @Test
    public void testPeajeMoto() {
        float peaje = moto.getPeaje();
        assertEquals(50.0f, peaje, "El peaje de una moto debe ser $50");
    }

    @Test
    public void testPlacaMoto() {
        assertEquals("XYZ456", moto.placa, "La placa de la moto debe ser XYZ456");
    }
}
