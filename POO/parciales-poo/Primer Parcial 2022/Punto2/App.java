<<<<<<< HEAD
package Punto2;

import java.util.Random;
// Sistema que genere un numero aleatorio de familias(1..10)
//    Familias
//[X]     apellido y lista de personas que componen
//[X]     Cantidad de integrantes debe ser aleatorio
//    Personas
//[X]  Nombre, apellido y edad
//[X]  Se eligen de forma aleatoria de dos listas, uno para cada uno
//[X]  Las listas deben ser precargadas con 20 elementos, pueden repetirse.
//[X]  Edad se define de forma aleatoria
//
// Ejemplo de output:
//  Familia Perez
//      Promedio de edad: 15
//  Integrantes:
//      Facundo
//      Samuel
//      Tamara

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Integer cantidadFamilias = random.nextInt(10);
        Familia[] familias = new Familia[cantidadFamilias];
        String[] nombres = {
                "Carlos", "María", "Juan", "Lucía", "Pedro",
                "Ana", "Luis", "Sofía", "Javier", "Isabel",
                "Diego", "Camila", "Fernando", "Elena", "Miguel",
                "Valeria", "Raúl", "Daniela", "Ricardo", "Sara"
        };
        String[] apellidos = {
                "García", "Rodríguez", "Martínez", "López", "Sánchez",
                "Pérez", "González", "Fernández", "Gómez", "Ruiz",
                "Díaz", "Moreno", "Álvarez", "Romero", "Torres",
                "Vázquez", "Ramírez", "Flores", "Castro", "Ortiz"
        };

        // ITERA SOBRE FAMILIAS
        for (int i = 0; i < cantidadFamilias; i++) {
            String apellidoFamilia = apellidos[random.nextInt(20)];
            Integer cantidadIntegrantes = random.nextInt(10);
            if (cantidadIntegrantes == 0) {
                cantidadIntegrantes += random.nextInt(10);
            }
            familias[i] = new Familia(apellidoFamilia);
            Persona[] integrantes = new Persona[cantidadIntegrantes];
            // ITERA SOBRE LOS INTEGRANTES
            for (int j = 0; j < integrantes.length; j++) {
                String nombreRandom = nombres[random.nextInt(20)];
                Integer edadRandom = random.nextInt(100);
                integrantes[j] = new Persona(nombreRandom, apellidoFamilia, edadRandom);
                familias[i].addIntegrante(integrantes[j]);
            }
            // IMPRIME LA INFORMACION
            familias[i].printFamData();
        }
    }
}
=======
package Punto2;

import java.util.Random;
// Sistema que genere un numero aleatorio de familias(1..10)
//    Familias
//[X]     apellido y lista de personas que componen
//[X]     Cantidad de integrantes debe ser aleatorio
//    Personas
//[X]  Nombre, apellido y edad
//[X]  Se eligen de forma aleatoria de dos listas, uno para cada uno
//[X]  Las listas deben ser precargadas con 20 elementos, pueden repetirse.
//[X]  Edad se define de forma aleatoria
//
// Ejemplo de output:
//  Familia Perez
//      Promedio de edad: 15
//  Integrantes:
//      Facundo
//      Samuel
//      Tamara

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Integer cantidadFamilias = random.nextInt(10);
        Familia[] familias = new Familia[cantidadFamilias];
        String[] nombres = {
                "Carlos", "María", "Juan", "Lucía", "Pedro",
                "Ana", "Luis", "Sofía", "Javier", "Isabel",
                "Diego", "Camila", "Fernando", "Elena", "Miguel",
                "Valeria", "Raúl", "Daniela", "Ricardo", "Sara"
        };
        String[] apellidos = {
                "García", "Rodríguez", "Martínez", "López", "Sánchez",
                "Pérez", "González", "Fernández", "Gómez", "Ruiz",
                "Díaz", "Moreno", "Álvarez", "Romero", "Torres",
                "Vázquez", "Ramírez", "Flores", "Castro", "Ortiz"
        };

        // ITERA SOBRE FAMILIAS
        for (int i = 0; i < cantidadFamilias; i++) {
            String apellidoFamilia = apellidos[random.nextInt(20)];
            Integer cantidadIntegrantes = random.nextInt(10);
            if (cantidadIntegrantes == 0) {
                cantidadIntegrantes += random.nextInt(10);
            }
            familias[i] = new Familia(apellidoFamilia);
            Persona[] integrantes = new Persona[cantidadIntegrantes];
            // ITERA SOBRE LOS INTEGRANTES
            for (int j = 0; j < integrantes.length; j++) {
                String nombreRandom = nombres[random.nextInt(20)];
                Integer edadRandom = random.nextInt(100);
                integrantes[j] = new Persona(nombreRandom, apellidoFamilia, edadRandom);
                familias[i].addIntegrante(integrantes[j]);
            }
            // IMPRIME LA INFORMACION
            familias[i].printFamData();
        }
    }
}
>>>>>>> b0db715506f45704e1bce067e552daaac1504ed7
