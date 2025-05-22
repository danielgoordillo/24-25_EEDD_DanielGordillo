import com.gordillo.daniel.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {

    @Test
    void gettersFuncionanCorrectamente() {
        Cliente cliente = new Cliente("Mario", "99999999X");
        Assertions.assertEquals("Mario", cliente.getNombre());
        Assertions.assertEquals("99999999X", cliente.getNif());
    }

    @Test
    void equalsYHashCodeFuncionan() {
        Cliente c1 = new Cliente("Maria", "12345678Z");
        Cliente c2 = new Cliente("Maria", "12345678Z");
        Cliente c3 = new Cliente("Pedro", "87654321X");

        Assertions.assertEquals(c1, c2);
        Assertions.assertNotEquals(c1, c3);
        Assertions.assertEquals(c1.hashCode(), c2.hashCode());
    }
}
