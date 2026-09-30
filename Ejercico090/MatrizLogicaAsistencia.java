import java.util.Scanner;

public class MatrizLogicaAsistencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEstudiantes;
        int numDias;
        int totalAsistenciasCurso = 0;
        int totalAusenciasCurso = 0;

        System.out.println("=== SISTEMA DE CONTROL DE ASISTENCIA ===");

        // Validación de número de estudiantes
        do {
            System.out.print("Ingrese la cantidad de estudiantes (mayor a 0): ");
            numEstudiantes = scanner.nextInt();
            if (numEstudiantes <= 0) {
                System.out.println("Error: El número de estudiantes debe ser mayor a 0.");
            }
        } while (numEstudiantes <= 0);

        // Validación de número de días
        do {
            System.out.print("Ingrese el número de días a registrar (mayor a 0): ");
            numDias = scanner.nextInt();
            if (numDias <= 0) {
                System.out.println("Error: El número de días debe ser mayor a 0.");
            }
        } while (numDias <= 0);

        // Bucle externo: Recorre estudiantes
        for (int i = 1; i <= numEstudiantes; i++) {
            int asistenciasEstudiante = 0;
            int ausenciasEstudiante = 0;

            System.out.println("\n--- REGISTRO PARA ESTUDIANTE " + i + " ---");

            // Bucle interno: Recorre días
            for (int j = 1; j <= numDias; j++) {
                char asistencia;
                do {
                    System.out.print("Día " + j + " - Ingrese asistencia (P: Presente / A: Ausente): ");
                    asistencia = scanner.next().toUpperCase().charAt(0);

                    if (asistencia != 'P' && asistencia != 'A') {
                        System.out.println("Error: Ingrese solo 'P' para Presente o 'A' para Ausente.");
                    }
                } while (asistencia != 'P' && asistencia != 'A');

                if (asistencia == 'P') {
                    asistenciasEstudiante++;
                } else {
                    ausenciasEstudiante++;
                }
            }

            System.out.println("-> Estudiante " + i + " - Asistencias: " + asistenciasEstudiante + " | Ausencias: " + ausenciasEstudiante);

            totalAsistenciasCurso += asistenciasEstudiante;
            totalAusenciasCurso += ausenciasEstudiante;
        }

        System.out.println("\n============================================");
        System.out.println("--- RESUMEN GENERAL DEL CURSO ---");
        System.out.println("Total Asistencias del Curso: " + totalAsistenciasCurso);
        System.out.println("Total Ausencias del Curso: " + totalAusenciasCurso);
        System.out.println("============================================");

        scanner.close();
    }
}