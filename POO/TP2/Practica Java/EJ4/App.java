package EJ4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Materia poo = new Materia("POO", "IF153");
        Materia algebra = new Materia("Algebra", "183");
        Materia introduccion = new Materia("Introduccion a la computacion");
        introduccion.setCodigo("IF300");
        Materia algortimica = new Materia("Algortimica", "500");

        ArrayList<Profesor> profesores = new ArrayList<>();

        Profesor profesor1 = new Profesor("Pedro", "Hernandez");
        profesor1.addMateria(poo);
        profesor1.addMateria(algebra);
        profesores.add(profesor1);
        Profesor profesor2 = new Profesor("Romina", "Alvarez");
        profesor2.addMateria(introduccion);
        profesor2.addMateria(algortimica);
        profesores.add(profesor2);
        Profesor profesor3 = new Profesor("Laura", "Perez");
        profesores.add(profesor3);

        for (Profesor pro : profesores) {
            System.out.println("Profesor: " + pro.getApellido() + " " + pro.getNombre());
            System.out.println("Materias: ");
            for (Materia mat : pro.getMateria()) {
                System.out.println(mat.getNombre());
            }
        }
    }
}
