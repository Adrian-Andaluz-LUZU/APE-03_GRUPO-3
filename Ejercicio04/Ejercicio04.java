import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, resultado;

        // Validación previa: se lee el número y se vuelve a pedir mientras sea incorrecto
        System.out.print("Ingrese un número entre 1 y 12: ");
        n = sc.nextInt();

        while (n < 1 || n > 12) {
            System.out.println("Dato incorrecto. Debe estar entre 1 y 12.");
            System.out.print("Ingrese un número entre 1 y 12: ");
            n = sc.nextInt();
        }

        // Ciclo controlado: multiplicador de 1 hasta 12
        System.out.println("--- TABLA DEL " + n + " ---");
        for (int i = 1; i <= 12; i++) {
            resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}
