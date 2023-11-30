package Nathanael.Martinez.Personajes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemigoTest {

    Enemigo enemigo = new Enemigo(100);
    Jugador jugador = new Jugador();

    @Test
    public void testVidaInicial(){
        Assertions.assertEquals(100, enemigo.getVida());
    }
    @Test
    public void testDecrementarVida(){
        jugador.atacar();
        Assertions.assertEquals(80, enemigo.getVida());
    }

}