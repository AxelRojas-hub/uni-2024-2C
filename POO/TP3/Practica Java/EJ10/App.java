package EJ10;

import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        ArrayList<Personal> listaPersonal = new ArrayList<>();
        Reloj reloj = new Reloj();
        // Instancia para generar numeros aleatorios para instanciar personas
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            // Renueva numeros random
            Integer numSector = random.nextInt(3); //
            Integer antiguedad = random.nextInt(15);
            String sector = setSector(numSector);
            String jornada = setJornada(numSector);
            Double horasDocente = setHorasRandom(setProbabilidad(sector));
            Double horasNoDocente = setHorasRandom(setProbabilidad(jornada));
            // Instancia y agrega a la lista
            Docente docente = new Docente("Docente" + i, antiguedad, "Docente", horasDocente, sector);
            listaPersonal.add(docente);
            NoDocente nodocente = new NoDocente("No docente" + i, antiguedad, "No docente", horasNoDocente, jornada);
            listaPersonal.add(nodocente);
        }

        // Imprime el informe
        System.out.println("");
        for (Personal personal : listaPersonal) {
            reloj.imprimeInforme(personal);
        }
    }

    public static Double setHorasRandom(Double probabilidad) {
        Random random = new Random();
        Double doubleRandom = random.nextDouble();
        // System.out.println("Random generado " + doubleRandom);
        // System.out.println("Probabilidad: " + probabilidad);
        if (doubleRandom < probabilidad) {
            // min+(max-min)*(random que va de 0 a 1)
            return 90 + (140 - 90) * random.nextDouble(); // formula que da +90hs
        } else {
            return 40 * random.nextDouble(); // Formula que da -90hs
        }
    }

    public static Double setProbabilidad(String categoria) {
        // Segun la categoria devuelve la probabilidad correspondiente
        switch (categoria) {
            case "simple":
                return 0.95;
            case "semiexclusiva":
                return 0.75;
            case "exclusiva":
                return 0.60;
            default:
                return 0.80;
        }
    }

    public static String setJornada(Integer numJornada) {
        // Segun un int random devuelve un tipo de jornada
        if (numJornada % 2 == 0) {
            return "completa";
        } else {
            return "reducida";
        }
    }

    public static String setSector(Integer numsector) {
        // Segun un int random devuelve una categoria
        switch (numsector) {
            case 0:
                return "simple";
            case 1:
                return "semiexclusiva";
            default:
                return "exclusiva";
        }
    }
}
