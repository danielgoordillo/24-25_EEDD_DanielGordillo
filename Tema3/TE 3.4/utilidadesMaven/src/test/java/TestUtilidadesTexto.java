import com.gordillo.daniel.UtilidadesTextos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUtilidadesTexto {

    @Test
    void testEsPalindromo() {
        assertTrue(UtilidadesTextos.esPalindromo("anita lava la tina"));
        assertFalse(UtilidadesTextos.esPalindromo("Hola Mundo"));
    }

    void testContarVocales() {
        assertEquals(5, UtilidadesTextos.contarVocales("Hola Mundo"));
    }

    void testContarConsonantes() {
        assertEquals(5, UtilidadesTextos.contarConsonantes("Hola Mundo"));
    }

    void testContarPalabras() {
        assertEquals(2, UtilidadesTextos.contarPalabras("Hola Mundo"));
    }

    void testContarCaracteres() {
        assertEquals(10, UtilidadesTextos.contarCaracteres("Hola Mundo"));
    }
}

