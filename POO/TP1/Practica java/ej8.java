package EJ5;

import java.util.Scanner;

// Desarrolle un programa que concatene dos frases ingresadas por el teclado y luego lo
// muestre por consola.

public class ej8 {
    public static void main(String[] args) {
        String cad1, cad2;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese la primera frase");
            cad1 = input.nextLine();
            System.out.println("Ingrese la segunda frase");
            cad2 = input.nextLine();
        }
        System.out.println(cad1 + " " + cad2);
    }
}
