package org.factoriaf5.peaje;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CamionTest {

    private Camion camion;

    @BeforeEach
    public void setUp() {
        camion = new Camion("LMN789", 3);  // Inicializamos un camión con 3 ejes
    }

    @Test
    public void testPeajeCamion() {
        float peaje = camion.getPeaje();
        assertEquals(150.0f, peaje, "El peaje de un camión con 3 ejes debe ser $150");
    }

    @Test
    public void testPlacaCamion() {
        assertEquals("LMN789", camion.placa, "La placa del camión debe ser LMN789");
    }

    @Test
    public void testNumeroDeEjesCamion() {
        // Verificamos que el camión tenga 3 ejes
        assertEquals(3, camion.numEjes, "El camión debe tener 3 ejes");
    }
}
