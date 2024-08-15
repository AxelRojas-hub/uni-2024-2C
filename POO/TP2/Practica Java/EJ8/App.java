package EJ8;

import java.util.ArrayList;

//  Como parte de un censo, para relevar la cantidad de personas
//  de una comuna se solicita un sistema que permita cargar familias
//  donde cada una esta compuesta por varias personas. 
//  De las personas es importante conocer: edad, sexo, si estudia y si trabaja
//  Desarrollar y diseñar clases y diagrama de clases

public class App {
    public static void main(String[] args) {
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

        for (Persona persona : familia.getPersonas()) {
            System.out.println(
                    "Edad:" + persona.getEdad() + ", Sexo:" + persona.getSexo() + "\nEstudia:" + persona.getEstudia()
                            + "Trabaja:" + persona.getTrabaja() + "\n");
        }
    }
}
