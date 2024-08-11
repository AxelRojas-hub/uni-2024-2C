package EJ5;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombre = read.nextLine();
            System.out.println("Su nombre es: " + nombre);
        }
    }
}
