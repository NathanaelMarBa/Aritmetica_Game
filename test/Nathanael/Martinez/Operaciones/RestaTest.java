package Nathanael.Martinez.Operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {
@Test
    public void testRestDosNumeros(){
    assertEquals(0,Resta.operacion(2,2));
}
@Test
    public void testRestaTresNumeros(){
    assertEquals(-4,Resta.operacion(1,2,3));
}
@Test
    public void testRestaDiferentesNumeros(){
    assertEquals(-3,Resta.operacion(-2,-1,1,1));
}
}