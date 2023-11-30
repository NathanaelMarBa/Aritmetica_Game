package Nathanael.Martinez.Operaciones;

public class Resta {
    public static double operacion(double... numeros){
        double resultado = numeros[0];
        for(int i = 1; i < numeros.length; i++ ){
            resultado -= numeros[i];
        }
        return resultado;
    }
}
