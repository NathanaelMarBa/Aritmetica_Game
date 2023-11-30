package Nathanael.Martinez.Operaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplicaciónTest {
    @Test
    public void  testMultiplicarDosNumeros(){
        Assertions.assertEquals(4,Multiplicación.operacion(2,2));
    }
    @Test
    public void testMultiplicarTresNumeros(){
        Assertions.assertEquals(6,Multiplicación.operacion(1,2,3));
    }
    @Test
    public void testMultiplicarDiferentesNumeros(){
        Assertions.assertEquals(0,Multiplicación.operacion(-2,-11,0,1,2));
    }

}