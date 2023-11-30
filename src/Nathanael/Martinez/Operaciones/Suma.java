package Nathanael.Martinez.Operaciones;

import java.util.Arrays;

public class Suma {


    public static double operacion(double... numeros) {
        double n = 0;
        return Arrays.stream(numeros).sum();
    }
}
