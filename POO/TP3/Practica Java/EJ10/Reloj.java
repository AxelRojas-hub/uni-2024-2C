package EJ10;

public class Reloj {
    public void imprimeInforme(Personal persona) {
        System.out.println(persona.toString());
        if (cumpleHoras(persona, persona.getHorasCorrespondientes())) {
            System.out.println("Cumplio las horas minimas.\n");
            System.out.println("-------------------------------------------------------------\n");
        } else {
            System.out.println("No cumplio las horas minimas\n");
            System.out.println("-------------------------------------------------------------\n");
        }
    }

    public Boolean cumpleHoras(Personal persona, Double horasCorrespondientes) {
        if (persona.getHorasTrabajadas() >= horasCorrespondientes) {
            return true;
        } else {
            return false;
        }
    }
}