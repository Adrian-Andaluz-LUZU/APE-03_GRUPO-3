import java.util.Scanner;

public class SistemaIntegradoVentas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionMenu;
        int cantidad;
        int totalVentas = 0;
        int unidadesVendidas = 0;

        double precio;
        double montoVenta;
        double totalRecaudado = 0.0;
        double ventaMayor = 0.0;

        do {
            System.out.println("\n=== SISTEMA INTEGRADO DE VENTAS ===");
            System.out.println("1. Registrar venta");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("\n--- REGISTRO DE VENTA ---");
                    scanner.nextLine(); // Limpiar el búfer del scanner
                    System.out.print("Ingrese el nombre del producto: ");
                    String producto = scanner.nextLine();

                    do {
                        System.out.print("Ingrese la cantidad (mayor a 0): ");
                        cantidad = scanner.nextInt();
                        if (cantidad <= 0) {
                            System.out.println("Error: La cantidad debe ser mayor a 0.");
                        }
                    } while (cantidad <= 0);

                    do {
                        System.out.print("Ingrese el precio unitario ($ mayor a 0): ");
                        precio = scanner.nextDouble();
                        if (precio <= 0) {
                            System.out.println("Error: El precio debe ser mayor a 0.");
                        }
                    } while (precio <= 0);

                    montoVenta = cantidad * precio;
                    totalVentas++;
                    unidadesVendidas += cantidad;
                    totalRecaudado += montoVenta;

                    if (totalVentas == 1 || montoVenta > ventaMayor) {
                        ventaMayor = montoVenta;
                    }

                    System.out.printf("Venta de '%s' registrada exitosamente. Monto: $%.2f\n", producto, montoVenta);
                    break;

                case 2:
                    System.out.println("\n--- ESTADÍSTICAS GENERALES DE VENTAS ---");
                    if (totalVentas > 0) {
                        double promedioVenta = totalRecaudado / totalVentas;
                        System.out.println("Número de ventas realizadas: " + totalVentas);
                        System.out.println("Total de unidades vendidas: " + unidadesVendidas);
                        System.out.printf("Total recaudado: $%.2f\n", totalRecaudado);
                        System.out.printf("Monto de la venta mayor: $%.2f\n", ventaMayor);
                        System.out.printf("Promedio por venta: $%.2f\n", promedioVenta);
                    } else {
                        System.out.println("No hay ventas registradas en el sistema.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcionMenu != 3);

        scanner.close();
    }
}