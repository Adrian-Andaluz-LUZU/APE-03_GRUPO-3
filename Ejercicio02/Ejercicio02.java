import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables acumuladoras y contadoras
        int sumaEdades = 0;
        int totalPersonas = 0;
        int menores = 0;
        int adultos = 0;
        int mayores65 = 0;

        System.out.println("=== CONTROL DE EDADES (Ingresa -1 para finalizar) ===");
        System.out.print("Ingrese una edad: ");

        // Validación de entrada numérica inicial
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Ingrese un valor entero válido.");
            System.out.print("Ingrese una edad: ");
            scanner.next();
        }

        int edad = scanner.nextInt();

        // Estructura sugerida: ciclo while con centinela -1
        while (edad != -1) {
            if (edad < -1) {
                System.out.println("Error: La edad no puede ser negativa.");
            } else {
                sumaEdades += edad;
                totalPersonas++;

                // Clasificación de rangos de edad
                if (edad < 18) {
                    menores++;
                } else if (edad <= 65) {
                    adultos++;
                } else {
                    mayores65++;
                }
            }

            // Solicitud de la siguiente edad
            System.out.print("Ingrese la siguiente edad (-1 para terminar): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un valor entero válido.");
                System.out.print("Ingrese la siguiente edad (-1 para terminar): ");
                scanner.next();
            }
            edad = scanner.nextInt();
        }

        // Presentación de resultados
        System.out.println("\n========== RESUMEN DE RESULTADOS ==========");
        if (totalPersonas > 0) {
            double promedio = (double) sumaEdades / totalPersonas;
            System.out.println("Cantidad de menores de edad (<18): " + menores);
            System.out.println("Cantidad de adultos (18-65): " + adultos);
            System.out.println("Cantidad de mayores de 65 años: " + mayores65);
            System.out.printf("Promedio de edades ingresadas: %.2f años\n", promedio);
        } else {
            System.out.println("No se ingresaron edades válidas para procesar.");
        }

        scanner.close();
    }
}
