import java.util.Scanner;

/**
 * Aplicación principal para gestionar empleados.
 */
public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados(Constantes.CAPACIDAD_POR_DEFECTO);

        empleados.darAlta(new Empleado("Juan Pérez", Cargo.DESARROLLADOR, 50000));
        empleados.darAlta(new Empleado("María López", Cargo.DISENADORA, 45000));
        empleados.darAlta(new Empleado("Pedro García", Cargo.GERENTE, 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Constantes.MSG_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(Constantes.MSG_LISTA);
        empleados.mostrarListado();

        scanner.close();
    }
}