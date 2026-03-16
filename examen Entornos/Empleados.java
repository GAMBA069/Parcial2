import java.util.ArrayList;
import java.util.List;

/**
 * Gestor de la colección de empleados.
 * Contiene el array interno renombrado a 'lista'.
 */
public class Empleados {

    private Empleado[] lista;
    private int size = 0;

    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
    }

    /**
     * Añade un empleado a la lista.
     * @param empleado empleado a añadir
     * @throws IllegalStateException si la capacidad está llena
     */
    public void darAlta(Empleado empleado) {
        if (size >= lista.length) throw new IllegalStateException(Constantes.MSG_CAPACIDAD_ALCANZADA);
        lista[size++] = empleado;
    }

    /**
     * Aumenta el salario de todos los empleados en el porcentaje indicado.
     * @param porcentaje porcentaje (ej. 10 para 10%)
     */
    public void aumentarSalario(double porcentaje) {
        for (int i = 0; i < size; i++) {
            Empleado e = lista[i];
            double nuevo = e.getSalario() * (1 + porcentaje / 100.0);
            e.setSalario(nuevo);
        }
    }

    /**
     * Muestra por consola el listado de empleados.
     */
    public void mostrarListado() {
        for (int i = 0; i < size; i++) {
            System.out.println(lista[i]);
        }
    }

    /**
     * Devuelve una copia en List de los empleados actualmente almacenados.
     * @return lista de empleados
     */
    public List<Empleado> getLista() {
        List<Empleado> out = new ArrayList<>(size);
        for (int i = 0; i < size; i++) out.add(lista[i]);
        return out;
    }
}