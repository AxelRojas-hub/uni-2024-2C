
// Programa que elija dos num enteros aleatorios.
// Si son iguales, repite hasta que sean distintos.
// Preguntar si apostamos por val1 o val2 (gana el mas alto)
// Mostrar valores e indicar si el usuario gano o perdio
// Preguntar si quiere volver a jugar, en caso de no, mostrar cantGanadas y cantPerdidas
// Contemplar consistencias para cualquier valor no numerico

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        int num1, num2;
        int ganadas = 0, perdidas = 0;
        int apuesta = 1 | 2;
        String rta = "si";
        Scanner input = new Scanner(System.in);

        while (rta.equalsIgnoreCase("si")) {
            do {
                num1 = (int) ((Math.random() * 100) + 1);
                num2 = (int) ((Math.random() * 100) + 1);
            } while (num1 == num2);
            System.out.println("num1: " + num1 + "num 2: " + num2);
            System.err.println("A cual valor apuesta? (1 o 2)");
            apuesta = input.nextInt();
            input.nextLine();

            if (apuesta == 1 && num1 > num2 || apuesta == 2 && num1 < num2) {
                ganadas++;
                System.out.println("Ganaste!");
            } else {
                perdidas++;
                System.out.println("Perdiste");
            }
            System.out.println("Desea seguir jugando?");
            rta = input.next();
        }
        System.out.println("Ganadas: " + ganadas);
        System.out.println("Perdidas: " + perdidas);
    }
}
