<<<<<<< HEAD
package Punto3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Integer cantProd = 10;
        Lavarropa[] lavarropas = new Lavarropa[cantProd];
        // Cocina[] cocinas = new Cocina[cantProd];
        // Heladera[] heladeras = new Heladera[cantProd];
        String[] marcas = {
                "LG",
                "Samsung",
                "Whirlpool",
                "Bosch",
                "Electrolux",
                "GE Appliances",
                "Frigidaire",
                "Miele",
                "KitchenAid",
                "Panasonic"
        };
        String[] colores = {
                "Rojo",
                "Azul",
                "Verde",
                "Amarillo",
                "Negro",
                "Blanco",
                "Gris",
                "Naranja",
                "Rosa",
                "Violeta"
        };

        for (int i = 0; i < cantProd; i++) {
            lavarropas[i] = new Lavarropa(marcas[random.nextInt(marcas.length)],
                    colores[random.nextInt(colores.length)], random.nextDouble() * 1000000, random.nextDouble());
        }
    }
}
=======
package Punto3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Integer cantProd = 10;
        Lavarropa[] lavarropas = new Lavarropa[cantProd];
        // Cocina[] cocinas = new Cocina[cantProd];
        // Heladera[] heladeras = new Heladera[cantProd];
        String[] marcas = {
                "LG",
                "Samsung",
                "Whirlpool",
                "Bosch",
                "Electrolux",
                "GE Appliances",
                "Frigidaire",
                "Miele",
                "KitchenAid",
                "Panasonic"
        };
        String[] colores = {
                "Rojo",
                "Azul",
                "Verde",
                "Amarillo",
                "Negro",
                "Blanco",
                "Gris",
                "Naranja",
                "Rosa",
                "Violeta"
        };

        for (int i = 0; i < cantProd; i++) {
            lavarropas[i] = new Lavarropa(marcas[random.nextInt(marcas.length)],
                    colores[random.nextInt(colores.length)], random.nextDouble() * 1000000, random.nextDouble());
        }
    }
}
>>>>>>> b0db715506f45704e1bce067e552daaac1504ed7
