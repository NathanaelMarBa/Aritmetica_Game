package Nathanael.Martinez.Operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {
Suma operaciones = new Suma();
@Test
    public void testSumarDosNumeros(){
    assertEquals(4, operaciones.operacion(2,2));
}
@Test
    public void testSumarDosNumerosFlotantes(){
    assertEquals(4.0,operaciones.operacion(2.0,2.0));
}
@Test
    public void testSumarTresNumeros(){
    assertEquals(15, operaciones.operacion(1,2,3,4,5));
}
@Test
    public void testSumarCincoNumerosNegativos(){
    assertEquals(-15,operaciones.operacion(-1,-2,-3,-4,-5));
}
@Test
    public void testSumarNumerosPositivosYNegativos(){
    assertEquals(0,operaciones.operacion(-5,-4,-3,-2,-1,1,2,3,4,5));
}
}