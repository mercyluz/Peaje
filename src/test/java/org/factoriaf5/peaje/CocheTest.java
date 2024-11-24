package org.factoriaf5.peaje;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CocheTest {

    private Coche coche;

    @BeforeEach
    public void setUp() {
        coche = new Coche("ABC123");  // Inicializamos un coche con una placa
    }

    @Test
    public void testPeajeCoche() {
        float peaje = coche.getPeaje();
        assertEquals(100.0f, peaje, "El peaje de un coche debe ser $100");
    }

    @Test
    public void testPlacaCoche() {
        assertEquals("ABC123", coche.placa, "La placa del coche debe ser ABC123");
    }
}
