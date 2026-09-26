import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        // Validación para la cantidad de estudiantes N
        do {
            System.out.print("Ingrese la cantidad de estudiantes (N > 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Error: El número de estudiantes debe ser mayor a 0.");
                }
            } else {
                System.out.println("Error: Ingrese un valor entero válido.");
                scanner.next(); // Limpiar entrada inválida
            }
        } while (n <= 0);

        // Variables acumuladoras y contadoras
        double sumaNotas = 0;
        int aprobados = 0;
        int reprobados = 0;
        double notaMayor = 0;
        double notaMenor = 10;

        // Estructura sugerida: ciclo for para iterar N estudiantes
        for (int i = 1; i <= n; i++) {
            double nota = -1;

            // Validación del rango de calificación (0 a 10)
            do {
                System.out.print("Ingrese la calificación del estudiante " + i + " (0 - 10): ");
                if (scanner.hasNextDouble()) {
                    nota = scanner.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Error: La calificación debe estar entre 0 y 10.");
                    }
                } else {
                    System.out.println("Error: Debe ingresar un número válido.");
                    scanner.next(); // Limpiar entrada inválida
                }
            } while (nota < 0 || nota > 10);

            // Acumular la suma de notas
            sumaNotas += nota;

            // Determinar nota mayor y menor en la primera iteración
            if (i == 1) {
                notaMayor = nota;
                notaMenor = nota;
            } else {
                if (nota > notaMayor) {
                    notaMayor = nota;
                }
                if (nota < notaMenor) {
                    notaMenor = nota;
                }
            }

            // Conteo de aprobados y reprobados
            if (nota >= 7.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Cálculo del promedio general
        double promedio = sumaNotas / n;

        // Mostrar resultados en consola
        System.out.println("\n========== RESUMEN DE RESULTADOS ==========");
        System.out.printf("Promedio general del grupo: %.2f\n", promedio);
        System.out.printf("Calificación mayor: %.2f\n", notaMayor);
        System.out.printf("Calificación menor: %.2f\n", notaMenor);
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de reprobados: " + reprobados);

        scanner.close();
    }
}
