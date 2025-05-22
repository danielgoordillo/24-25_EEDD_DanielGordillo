import com.gordillo.daniel.Cliente;
import com.gordillo.daniel.Cuenta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CuentaTest {

    private Cuenta cuenta;
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Juan", "12345678A");
        cuenta = new Cuenta(cliente, "CUENTA001");
    }

    @Test
    void agregarImporteSumaCorrectamente() {
        cuenta.agregarImporte(100);
        Assertions.assertEquals(100, cuenta.getSaldo());
    }

    @Test
    void agregarImporteCuentaInactivaLanzaExcepcion() {
        cuenta.cerrar();
        assertThrows(IllegalStateException.class, () -> cuenta.agregarImporte(50));
    }

    @Test
    void agregarImporteNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> cuenta.agregarImporte(-20));
    }

    @Test
    void retirarImporteRestaCorrectamente() {
        cuenta.agregarImporte(100);
        cuenta.retirarImporte(40);
        Assertions.assertEquals(60, cuenta.getSaldo());
    }


    @Test
    void retirarImporteCuentaInactivaLanzaExcepcion() {
        cuenta.cerrar(); // Cierra sin saldo
        assertThrows(IllegalStateException.class, () -> cuenta.retirarImporte(50));
    }


    @Test
    void retirarImporteNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirarImporte(-10));
    }

    @Test
    void retirarImporteMayorSaldoLanzaExcepcion() {
        cuenta.agregarImporte(30);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirarImporte(50));
    }

    @Test
    void cerrarConSaldoCeroDesactivaCuenta() {
        cuenta.cerrar();
        Assertions.assertFalse(cuenta.estaActiva());
    }

    @Test
    void cerrarConSaldoNoCeroLanzaExcepcion() {
        cuenta.agregarImporte(20);
        assertThrows(IllegalStateException.class, cuenta::cerrar);
    }
}

