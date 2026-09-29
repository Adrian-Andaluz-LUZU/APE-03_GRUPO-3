import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int aprobados = 0;
        int reprobados = 0;

        double nota;
        double suma = 0;
        double mayor = 0;
        double menor = 10;

        System.out.print("Ingrese el número de estudiantes: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {

            do {
                System.out.print(
                    "Ingrese la nota del estudiante " + i + " (0-10): "
                );
                nota = entrada.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println(
                        "Nota inválida. Debe estar entre 0 y 10."
                    );
                }

            } while (nota < 0 || nota > 10);

            suma += nota;

            if (nota > mayor) {
                mayor = nota;
            }

            if (nota < menor) {
                menor = nota;
            }

            if (nota >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / n;
        double porcentajeAprobados = (aprobados * 100.0) / n;
        double porcentajeReprobados = (reprobados * 100.0) / n;

        System.out.println("\n===== ESTADÍSTICAS DEL CURSO =====");
        System.out.printf("Promedio general: %.2f%n", promedio);
        System.out.printf("Nota mayor: %.2f%n", mayor);
        System.out.printf("Nota menor: %.2f%n", menor);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
        System.out.printf(
            "Porcentaje de aprobados: %.2f%%%n",
            porcentajeAprobados
        );
        System.out.printf(
            "Porcentaje de reprobados: %.2f%%%n",
            porcentajeReprobados
        );

        entrada.close();
    }
}