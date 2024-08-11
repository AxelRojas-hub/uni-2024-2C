package EJ5;

import java.util.Scanner;

// Desarrolle un programa que permita sumar dos enteros que son ingresados por teclado
// y luego lo muestre por consola.

public class ej7 {
    public static void main(String[] args) {
        int num1, num2;
        try (Scanner inputScanner = new Scanner(System.in)) {
            // System.out.print("Ingrese el primer numero: ");
            // num1 = Integer.parseInt(inputScanner.nextLine());
            // System.out.print("Ingrese el segundo numero: ");
            // num2 = Integer.parseInt(inputScanner.nextLine());
            System.out.print("Ingresar primer numero: ");
            num1 = inputScanner.nextInt();
            System.out.print("Ingresar Segundo numero: ");
            num2 = inputScanner.nextInt();
        }
        System.out.println("La suma es: " + (num1 + num2));
    }
}
