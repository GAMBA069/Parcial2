/**
 * Constantes del proyecto (mensajes y valores fijos).
 */
public final class Constantes {
    public static final int CAPACIDAD_POR_DEFECTO = 3;
    public static final String MSG_PORCENTAJE = "Introduzca el porcentaje de aumento de salario: ";
    public static final String MSG_LISTA = "Lista de Empleados:";
    public static final String MSG_CAPACIDAD_ALCANZADA = "Capacidad máxima alcanzada";
    public static final double MIN_SALARIO_CONVENIO = 10000.0;

    public static final String MSG_NOMBRE_INVALIDO = "Nombre inválido: debe contener al menos dos palabras y no estar vacío.";
    public static final String MSG_CARGO_INVALIDO = "Cargo inválido: debe ser uno de los cargos admitidos.";
    public static final String MSG_SALARIO_INVALIDO = "Salario inválido: debe ser un número no negativo y no inferior al salario mínimo de convenio.";

    private Constantes() { }
}