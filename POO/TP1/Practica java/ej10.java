package EJ5;

import java.util.Scanner;

// Escriba un programa que calcule el índice de masa corporal ( , los datos
// peso/estatura**
// deberán ser ingresados por el usuario y luego el resultado será impreso en pantalla.

public class ej10 {
    public static void main(String[] args) {
        double imc, peso, estatura;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos");
        peso = Double.parseDouble(inputScanner.nextLine());
        System.out.println("Ingrese su altura en metros");
        estatura = Double.parseDouble(inputScanner.nextLine());
        imc = peso / (estatura * estatura);
        System.out.println("Su IMC es: " + imc);
    }
}
