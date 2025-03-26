import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestUtilidadesNumeros {

    void testEsPar() {
        assertTrue(UtilidadesNumeros.esPar(4));
        assertFalse(UtilidadesNumeros.esPar(7));
    }

    void testEsImpar() {
        assertTrue(UtilidadesNumeros.esImpar(7));
        assertFalse(UtilidadesNumeros.esImpar(4));
    }

    void testEsPrimo() {
        assertTrue(UtilidadesNumeros.esPrimo(7));
        assertFalse(UtilidadesNumeros.esPrimo(8));
    }

    void testFactorial() {
        assertEquals(120, UtilidadesNumeros.factorial(5));
    }

    void testDevolverDivisores() {
        List<Integer> esperado = Arrays.asList(1, 2, 4, 8);
        assertEquals(esperado, UtilidadesNumeros.devolverDivisores(8));
    }

    void testEsPerfecto() {
        assertTrue(UtilidadesNumeros.esPerfecto(6));
        assertFalse(UtilidadesNumeros.esPerfecto(8));
    }
}
