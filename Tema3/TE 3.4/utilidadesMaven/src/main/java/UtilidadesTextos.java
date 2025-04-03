public class UtilidadesTexto {
    // Versión 1.1
    public static boolean esPalindromo(String cadena) {
        String limpia = cadena.replaceAll("\\s", "").toLowerCase();
        String reversa = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(reversa);
    }
    
    public static int contarVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (char c : cadena.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
    
    // Versión 1.2
    public static int contarConsonantes(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (char c : cadena.toCharArray()) {
            if (Character.isLetter(c) && vocales.indexOf(c) == -1) {
                contador++;
            }
        }
        return contador;
    }
    
    public static int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        return cadena.trim().split("\\s+").length;
    }
    
    // Versión 1.3
    public static int contarCaracteres(String cadena) {
        return cadena.length();
    }
}
