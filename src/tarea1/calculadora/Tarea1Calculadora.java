//This java program is a calculator that can add, subtract, multiply and divide two numbers.
//The program asks the user to choose an option from the menu and then asks for the two numbers to perform the operation.

package tarea1.calculadora;

import java.util.Scanner;

public class Tarea1Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\033[H\033[2J"); // Clear the console
            System.out.println("");
            System.out.println("Programa de Calculadora");
            System.out.println("");
            System.out.println("Menú:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("");
            System.out.print("Elija una opción: ");
            int option = scanner.nextInt(); // Read the option

            switch (option) {
                case 1:
                    sumar(scanner);
                    break;
                case 2:
                    restar(scanner);
                    break;
                case 3:
                    multiplicar(scanner);
                    break;
                case 4:
                    dividir(scanner);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.print("¿Desea volver al menú o salir del programa? (S/N) (en MAYUSCULA por favor): ");
            String continuar = scanner.next(); // Read the option

            while (!continuar.equals("S") && !continuar.equals("N")) {
                System.out.println(
                        "Opción inválida, ingrese S o N, S para volver al menú y N para salir del programa, debe ser en MAYUSCULA.");
                System.out.print("¿Desea volver al menú o salir del programa? (S/N): ");
                continuar = scanner.next();
            }

            if (continuar.equals("N")) {
                break;
            }
        }

        System.out.println("");
        System.out.println("Gracias por usar la calculadora.");
    }

    public static void sumar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println("");
    }

    public static void restar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("");
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println("");
    }

    public static void multiplicar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("");
        System.out.println(a + " por " + b + " = " + (a * b));
        System.out.println("");
    }

    public static void dividir(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("");
        System.out.println(a + " dividido entre " + b + " = " + (a / b));
        System.out.println("");
    }
}
