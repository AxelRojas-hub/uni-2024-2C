package EJ12;

public class App {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("De la costa", "Luis Galino 625");
        Persona empleado1 = new Persona(20, "Masculino", false, true, "Administrativo");
        Persona empleado2 = new Persona(40, "Femenino", false, true, "Administrativo");
        Persona empleado3 = new Persona(19, "Masculino", false, true, "Administrativo");
        Persona empleado4 = new Persona(23, "Femenino", true, true, "Gerente");
        Persona empleado5 = new Persona(25, "Masculino", false, true, "Tesorero");

        empresa.addEmpleado(empleado1);
        empresa.addEmpleado(empleado2);
        empresa.addEmpleado(empleado3);
        empresa.addEmpleado(empleado4);
        empresa.addEmpleado(empleado5);

        for (Persona persona : empresa.getEmpleados()) {
            System.out.println(persona.toString());
        }
    }
}
