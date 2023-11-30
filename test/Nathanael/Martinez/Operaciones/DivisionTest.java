package Nathanael.Martinez.Operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    Division division =new Division();
@Test
    public  void testDividirDosNumeros(){

    assertEquals(2.5,division.operacion(5,2));
}
@Test
    public void testDividirTresNumeros(){
    assertEquals(0.16666666666666666,division.operacion(1,2,3));
}
@Test
    public void testDividirDiferentesNumeros(){
    assertEquals(1,division.operacion(-2,-1.0,1,2));
}
@Test
    public void testDivisionPorCero(){
    assertEquals(Double.POSITIVE_INFINITY, division.operacion(1,0));
}
}