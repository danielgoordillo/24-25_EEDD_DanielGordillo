public class UtilidadesTextos {

    public static boolean esPalindromo(String cadena) {
        String limpiado = cadena.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(limpiado).reverse().toString().equals(limpiado);
    }

    public static int contarVocales(String cadena) {
        return (int) cadena.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    public static int contarConsonantes(String cadena) {
        return (int) cadena.toLowerCase().chars()
                .filter(c -> Character.isLetter(c) && "aeiou".indexOf(c) == -1)
                .count();
    }

    public static int contarPalabras(String cadena) {
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }

    public static int contarCaracteres(String cadena) {
        return cadena.length();
    }
}


