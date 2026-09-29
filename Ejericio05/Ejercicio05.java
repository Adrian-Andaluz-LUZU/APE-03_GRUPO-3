import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo, deposito, retiro;
        int opcion;
        int transacciones = 0;

        System.out.print("Ingrese el saldo inicial: ");
        saldo = entrada.nextDouble();

        do {
            System.out.println("\n===== CAJERO UNIVERSITARIO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Número de transacciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Saldo disponible: $%.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el valor a depositar: ");
                    deposito = entrada.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        transacciones++;
                        System.out.println("Depósito realizado correctamente.");
                    } else {
                        System.out.println("El valor debe ser positivo.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el valor a retirar: ");
                    retiro = entrada.nextDouble();

                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        transacciones++;
                        System.out.println("Retiro realizado correctamente.");
                    } else {
                        System.out.println(
                            "Retiro no válido. Verifique el valor y su saldo."
                        );
                    }
                    break;

                case 4:
                    System.out.println(
                        "Número de transacciones: " + transacciones
                    );
                    break;

                case 5:
                    System.out.println("Gracias por utilizar el cajero.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        entrada.close();
    }
}