import java.util.ArrayList;
import java.util.List;

public class UtilidadesNumeros {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esImpar(int numero) {
        return numero % 2 != 0;
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static long factorial(int numero) {
        if (numero < 0) throw new IllegalArgumentException("Número negativo no permitido");
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static List<Integer> devolverDivisores(int numero) {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) divisores.add(i);
        }
        return divisores;
    }

    public static boolean esPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) suma += i;
        }
        return suma == numero;
    }
}




