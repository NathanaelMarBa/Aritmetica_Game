package Nathanael.Martinez.Operaciones;

import java.util.Arrays;

public class Division {

    public static double operacion(double... numeros) {
        double resultado = numeros[0];
    for (int i = 1; i < numeros.length; i++){
            resultado /= numeros [1];
        }
   return resultado;
    }

    }




















//Arrays.stream(numeros)
  //      .reduce((n1, n2) -> n1 / n2)
    //    .orElse(1);