package EJ5;

import java.util.Scanner;

// Desarrolle un programa que indique cómo es un número ingresado por el usuario con
// respecto a otro que es generado aleatoriamente del 1 al 10 al comenzar el programa.
// Debe de evaluar si es igual, menor, mayor, distinto, menor o igual y mayor o igual.

public class ej9 {
    public static void main(String[] args) {
        int numRandom, num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        num1 = Integer.parseInt(input.nextLine());
        numRandom = (int) (Math.random() * 10) + 1;
        // 10 es el valor max, +1 para que nunca sea 0

        if (num1 == numRandom) {
            System.out.println(num1 + " es igual a " + numRandom);
        } else {
            System.out.println(num1 + " es distinto a " + numRandom);
        }

        if (num1 != numRandom && num1 > numRandom) {
            System.out.println(num1 + " es mayor a " + numRandom);
        } else {
            System.out.println(num1 + " es menor a " + numRandom);
        }

        if (num1 >= numRandom) {
            System.out.println(num1 + " es mayor o igual a " + numRandom);
        } else {
            System.out.println(num1 + " es menor o igual a " + numRandom);
        }
    }
}
