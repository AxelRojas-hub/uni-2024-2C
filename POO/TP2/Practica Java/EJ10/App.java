package EJ10;

import java.util.ArrayList;

// Requerimientos
// [X] Cantidad de familias censadas
// [X] Cantidad de personas
// [X] Promedio de edad 
// [] Cantidad de personas que trabajan

public class App {
    public static void main(String[] args) {
        // Instancia la clase Persona, y las agrega a una instancia de la clase Familia
        Persona persona1 = new Persona(9, "Femenino", true, false);
        Persona persona2 = new Persona(10, "Femenino", true, false);
        Persona persona3 = new Persona(25, "Masculino", true, true);
        Persona persona4 = new Persona(49, "Masculino", false, true);
        Persona persona5 = new Persona(55, "Femenino", true, false);

        Familia familia = new Familia(0, new ArrayList<Persona>());
        familia.addpersona(persona1);
        familia.addpersona(persona2);
        familia.addpersona(persona3);
        familia.addpersona(persona4);
        familia.addpersona(persona5);

        Persona persona6 = new Persona(12, "Femenino", true, false);
        Persona persona7 = new Persona(13, "Femenino", true, false);
        Persona persona8 = new Persona(15, "Masculino", true, true);
        Persona persona9 = new Persona(30, "Masculino", false, true);
        Persona persona10 = new Persona(35, "Femenino", true, false);

        Familia familia2 = new Familia(1, new ArrayList<Persona>());
        familia2.addpersona(persona6);
        familia2.addpersona(persona7);
        familia2.addpersona(persona8);
        familia2.addpersona(persona9);
        familia2.addpersona(persona10);

        Persona persona11 = new Persona(16, "Femenino", true, false);
        Persona persona12 = new Persona(5, "Femenino", true, false);
        Persona persona13 = new Persona(7, "Masculino", true, true);
        Persona persona14 = new Persona(9, "Masculino", false, true);
        Persona persona15 = new Persona(35, "Femenino", true, false);

        Familia familia3 = new Familia(2, new ArrayList<Persona>());
        familia3.addpersona(persona11);
        familia3.addpersona(persona12);
        familia3.addpersona(persona13);
        familia3.addpersona(persona14);
        familia3.addpersona(persona15);
        // -----------------------------------
        // Instancia Clase Comuna y agrega las familias censadas
        Comuna comuna = new Comuna("Stella Maris");
        comuna.addFamilia(familia);
        comuna.addFamilia(familia2);
        comuna.addFamilia(familia3);
        // ------------------------------------
        System.out.println("Familias censadas: " + comuna.familiasCensadas());
        System.out.println("Cantidad de personas: " + comuna.getCantidadPersonas());
        System.out.println("Promedio de edad: " + comuna.getPromedioEdad());
        System.out.println("Cantidad de trabajadores: " + comuna.getCantidadTrabajadores());
        System.out.println("Persona 11. Puede trabajar:" + persona11.getPuede_trabajar() + ", Puede manejar:"
                + persona11.getPuede_manejar());
        // for (Persona persona : familia.getPersonas()) {
        // System.out.println(
        // "Edad:" + persona.getEdad() + ", Sexo:" + persona.getSexo() + "\nEstudia:" +
        // persona.getEstudia()
        // + "Trabaja:" + persona.getTrabaja() + "\n");
        // }

    }
}
