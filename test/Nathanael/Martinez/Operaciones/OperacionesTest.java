package Nathanael.Martinez.Operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {

    Suma operaciones = new Suma();

    @Test
    public void testSumarDosNumeros() {
        assertEquals(4, operaciones.operacion(2, 2));
    }

    @Test
    public void testSumarDosNumerosFlotantes() {
        assertEquals(4.0, operaciones.operacion(2.0, 2.0));
    }

    @Test
    public void testSumarTresNumeros() {
        assertEquals(15, operaciones.operacion(1, 2, 3, 4, 5));
    }

    @Test
    public void testSumarNegativos() {
        // Sumar 5 números negativos del 1 al 5
        assertEquals(-15, operaciones.operacion(-1, -2, -3, -4, -5));
    }

    @Test
    public void testSumarPositivosYNegativos() {
        // Sumar 10 números positivos y negativos entre -5 y 5
        assertEquals(0, operaciones.operacion(-5, -4, -3, -2, -1, 1, 2, 3, 4, 5));
    }

}
