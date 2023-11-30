package Nathanael.Martinez.Operaciones;


import java.util.Random;

public class Utilidades {
    private static final Random random= new Random();

    public static int generarNumeroAleatorio(){
        return random.nextInt(4);
    }

}
