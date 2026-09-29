import java.util.Scanner;

public class Ejercicio07{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String tipo;
        String continuar;

        int cantidad;
        int totalEntradas = 0;

        double precio;
        double subtotal;
        double total = 0;

        do {

            System.out.println("\n===== CINECAMPUS =====");

            System.out.print("Ingrese el tipo de entrada: ");
            tipo = entrada.next();

            System.out.print("Ingrese la cantidad de entradas: ");
            cantidad = entrada.nextInt();

            System.out.print("Ingrese el precio de cada entrada: ");
            precio = entrada.nextDouble();

            subtotal = cantidad * precio;

            total += subtotal;
            totalEntradas += cantidad;

            System.out.printf("Tipo de entrada: %s%n", tipo);
            System.out.printf("Subtotal: $%.2f%n", subtotal);
            System.out.printf("Total acumulado: $%.2f%n", total);

            System.out.print("¿Desea realizar otra venta? (S/N): ");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\n===== RESUMEN FINAL =====");
        System.out.println(
            "Total de entradas vendidas: " + totalEntradas
        );
        System.out.printf("Total de ventas: $%.2f%n", total);

        entrada.close();
    }
}