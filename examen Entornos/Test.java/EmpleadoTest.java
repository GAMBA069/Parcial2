import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests de caja negra para la clase Empleado.
 */
public class EmpleadoTest {

    @Test
    public void constructorValido_noThrows() {
        assertDoesNotThrow(() -> new Empleado("Ana María", Cargo.DESARROLLADOR, Constantes.MIN_SALARIO_CONVENIO));
    }

    @Test
    public void nombreVacio_lanza() {
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Empleado("", Cargo.DESARROLLADOR, Constantes.MIN_SALARIO_CONVENIO));
        assertTrue(e.getMessage().contains("Nombre inválido"));
    }

    @Test
    public void nombreUnaPalabra_lanza() {
        assertThrows(IllegalArgumentException.class, () ->
                new Empleado("Carlos", Cargo.GERENTE, Constantes.MIN_SALARIO_CONVENIO));
    }

    @Test
    public void cargoNull_lanza() {
        assertThrows(IllegalArgumentException.class, () ->
                new Empleado("Luis Pérez", null, Constantes.MIN_SALARIO_CONVENIO));
    }

    @Test
    public void salarioNegativo_lanza() {
        assertThrows(IllegalArgumentException.class, () ->
                new Empleado("Laura Ruiz", Cargo.DISENADORA, -1.0));
    }

    @Test
    public void salarioPorDebajoConvenio_lanza() {
        assertThrows(IllegalArgumentException.class, () ->
                new Empleado("Luis Martinez", Cargo.DISENADORA, Constantes.MIN_SALARIO_CONVENIO - 1.0));
    }

    @Test
    public void settersYGetters_funcionan() {
        Empleado e = new Empleado("Pedro García", Cargo.GERENTE, Constantes.MIN_SALARIO_CONVENIO);
        e.setNombre("Pedro García López");
        assertEquals("Pedro García López", e.getNombre());
        e.setCargo(Cargo.DESARROLLADOR);
        assertEquals(Cargo.DESARROLLADOR, e.getCargo());
        e.setSalario(Constantes.MIN_SALARIO_CONVENIO + 1000);
        assertEquals(Constantes.MIN_SALARIO_CONVENIO + 1000, e.getSalario());
    }
}