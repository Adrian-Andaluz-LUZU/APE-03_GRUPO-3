import java.util.Scanner;

public class EstacionamientoUniversitario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        int opcionCentinela;
        int tipoVehiculo;
        double horas;
        double tarifa;
        double pagoIndividual;
        double recaudacionTotal = 0.0; // Acumulador

        System.out.println("=== SISTEMA DE ESTACIONAMIENTO UNIVERSITARIO ===");
        System.out.println("1. Registrar vehiculo");
        System.out.println("0. Salir y mostrar recaudacion total");
        System.out.print("Seleccione una opcion: ");
        opcionCentinela = scanner.nextInt();

        // Estructura repetitiva while con variable centinela
        while (opcionCentinela == 1) {
            System.out.println("\n--- REGISTRO DE VEHÍCULO ---");
            System.out.println("1. Auto");
            System.out.println("2. Moto");
            System.out.println("3. Autobus / Otro");
            System.out.print("Seleccione el tipo de vehiculo: ");
            tipoVehiculo = scanner.nextInt();

            // Validación de horas
            do {
                System.out.print("Ingrese el numero de horas estacionado: ");
                horas = scanner.nextDouble();
                if (horas <= 0) {
                    System.out.println("Error: El tiempo de estacionamiento debe ser mayor a 0.");
                }
            } while (horas <= 0);

            // Validación de tarifa
            do {
                System.out.print("Ingrese la tarifa por hora ($): ");
                tarifa = scanner.nextDouble();
                if (tarifa <= 0) {
                    System.out.println("Error: La tarifa debe ser mayor a 0.");
                }
            } while (tarifa <= 0);

            // Cálculo individual y acumulación
            pagoIndividual = horas * tarifa;
            recaudacionTotal += pagoIndividual;

            // Salida individual
            System.out.printf("Valor a pagar por este vehiculo: $%.2f\n", pagoIndividual);

            // Actualización de la condición centinela
            System.out.println("\n¿Desea registrar otro vehiculo?");
            System.out.println("1. Si");
            System.out.println("0. No (Finalizar)");
            System.out.print("Opcion: ");
            opcionCentinela = scanner.nextInt();
        }

        // Resumen final de la recaudación acumulada
        System.out.println("\n============================================");
        System.out.printf("RECAUDACIÓN TOTAL ACUMULADA: $%.2f\n", recaudacionTotal);
        System.out.println("============================================");

        scanner.close();
    }
}