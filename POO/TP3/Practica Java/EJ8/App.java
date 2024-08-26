package EJ8;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<ProfesorTitular> titulares = new ArrayList<>();
        ArrayList<ProfesorSuplente> suplentes = new ArrayList<>();

        titulares.add(new ProfesorTitular("Aldana", "Gutierrez", 40, 40, 15));
        titulares.add(new ProfesorTitular("Pedro", "Perez", 30, 30, 4));
        titulares.add(new ProfesorTitular("Maria", "Gomez", 29, 40, 1));

        suplentes.add(new ProfesorSuplente("Tomas", "Sosa", 28, 40));
        suplentes.add(new ProfesorSuplente("Luciana", "Torres", 35, 10));

        for (ProfesorTitular prof : titulares) {
            System.out.println("Nombre y Apellido " + prof.getNombre() + ", " + prof.getApellido());
            System.out.println("Es titular");
            String cadenaSueldo = String.format(
                    "Remuneracion: %,.2f", prof.get_remuneracion_mensual());
            System.out.println(cadenaSueldo);
            System.out.println("-------------");
        }

        for (ProfesorSuplente prof : suplentes) {
            System.out.println("Nombre y Apellido " + prof.getNombre() + ", " + prof.getApellido());
            System.out.println("No es titular");
            System.out.println("Remuneracion: " + prof.get_remuneracion_mensual());
            System.out.println("-------------");
        }
    }
}
