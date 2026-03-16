/**
 * Representa un empleado con nombre, cargo y salario.
 */
public class Empleado {

    private String nombre;
    private Cargo cargo;
    private double salario;

    public Empleado(String nombre, Cargo cargo, double salario) {
        setNombre(nombre);
        setCargo(cargo);
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre. Requiere al menos dos palabras y no vacío.
     * @param nombre nombre completo
     * @throws IllegalArgumentException si no cumple la regla
     */
    public void setNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException(Constantes.MSG_NOMBRE_INVALIDO);
        String t = nombre.trim();
        if (t.isEmpty() || t.split("\\s+").length < 2) {
            throw new IllegalArgumentException(Constantes.MSG_NOMBRE_INVALIDO);
        }
        this.nombre = t;
    }

    public Cargo getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo. No puede ser null.
     * @param cargo cargo profesional
     * @throws IllegalArgumentException si cargo es null
     */
    public void setCargo(Cargo cargo) {
        if (cargo == null) throw new IllegalArgumentException(Constantes.MSG_CARGO_INVALIDO);
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario. Debe ser >= Constantes.MIN_SALARIO_CONVENIO y no negativo.
     * @param salario valor del salario
     * @throws IllegalArgumentException si salario inválido
     */
    public void setSalario(double salario) {
        if (Double.isNaN(salario) || salario < 0.0 || salario < Constantes.MIN_SALARIO_CONVENIO) {
            throw new IllegalArgumentException(Constantes.MSG_SALARIO_INVALIDO);
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo=" + cargo +
                ", salario=" + salario +
                '}';
    }
}