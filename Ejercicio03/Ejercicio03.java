import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double a, b, resultado;

        do {
            System.out.println("===== CALCULADORA =====");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            a = 0;
            b = 0;
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                a = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                b = sc.nextDouble();
            }

            switch (opcion) {
                case 1:
                    resultado = a + b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = a - b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = a * b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (b != 0) {
                        resultado = a / b;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: no se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 5);

        sc.close();
    }
}
