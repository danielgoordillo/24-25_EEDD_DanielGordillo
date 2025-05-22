

import com.gordillo.daniel.Banco;
import com.gordillo.daniel.Cliente;
import com.gordillo.daniel.Cuenta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    private Banco banco;
    private Cliente cliente1;
    private Cliente cliente2;

    @BeforeEach
    void setUp() {
        banco = new Banco("Banco Test");
        cliente1 = new Cliente("Ana", "11111111A");
        cliente2 = new Cliente("Luis", "22222222B");
    }

    @Test
    void abrirCuentaClienteDuplicadoLanzaExcepcion() {
        banco.abrirCuenta(cliente1);
        assertThrows(IllegalArgumentException.class, () -> banco.abrirCuenta(cliente1));
    }

    @Test
    void cerrarCuentaLaDesactiva() {
        Cuenta cuenta = banco.abrirCuenta(cliente1);
        banco.cerrarCuenta(cuenta.getNumeroCuenta());
        assertFalse(cuenta.estaActiva());
    }

    @Test
    void cerrarCuentaConSaldoLanzaExcepcion() {
        Cuenta cuenta = banco.abrirCuenta(cliente1);
        cuenta.agregarImporte(50);
        assertThrows(IllegalStateException.class, () -> banco.cerrarCuenta(cuenta.getNumeroCuenta()));
    }

    @Test
    void obtenerCuentaValidaRetornaCuenta() {
        Cuenta cuenta = banco.abrirCuenta(cliente1);
        Cuenta resultado = banco.obtenerCuenta(cuenta.getNumeroCuenta());
        assertEquals(cuenta, resultado);
    }

    @Test
    void obtenerCuentaInexistenteLanzaExcepcion() {
        assertThrows(NoSuchElementException.class, () -> banco.obtenerCuenta("NO_EXISTE"));
    }

    @Test
    void transferirTitularesIgualesLanzaExcepcion() {
        Cuenta cuenta = banco.abrirCuenta(cliente1);
        cuenta.agregarImporte(100);
        assertThrows(IllegalArgumentException.class, () -> banco.transferir(cuenta.getNumeroCuenta(), cuenta.getNumeroCuenta(), 10));
    }

    @Test
    void transferirCuentaInactivaLanzaExcepcion() {
        Cuenta origen = banco.abrirCuenta(cliente1);
        Cuenta destino = banco.abrirCuenta(cliente2);
        origen.agregarImporte(100);
        destino.cerrar();
        assertThrows(IllegalStateException.class, () -> banco.transferir(origen.getNumeroCuenta(), destino.getNumeroCuenta(), 10));
    }

    @Test
    void transferirSaldoActualizadoCorrectamente() {
        Cuenta origen = banco.abrirCuenta(cliente1);
        Cuenta destino = banco.abrirCuenta(cliente2);
        origen.agregarImporte(100);
        banco.transferir(origen.getNumeroCuenta(), destino.getNumeroCuenta(), 40);
        assertEquals(60, origen.getSaldo());
        assertEquals(40, destino.getSaldo());
    }
}
