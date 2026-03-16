/**
 * Cargos profesionales válidos.
 */
public enum Cargo {
    DESARROLLADOR("Desarrollador"),
    DISENADORA("Diseñadora"),
    GERENTE("Gerente");

    private final String descripcion;

    Cargo(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}

