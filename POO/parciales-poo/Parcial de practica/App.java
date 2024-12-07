import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        String[] habilidades = { "Ataque", "Pase", "Defensa" };
        String[] clubes = { "Arsenal", "Montevideo City Torque", "Inter Miami", "Manchester City" };
        String[] paises = { "Argentina", "Inglaterra", "Holanda", "Japon" };

        ArrayList<Jugador> jugadoresAux = new ArrayList<>();
        for (int i = 0; i < 22; i++) {
            String clubRandom = clubes[random.nextInt(clubes.length)];
            String paisRandom = paises[random.nextInt(paises.length)];
            String habilidadRandom = habilidades[random.nextInt(habilidades.length)];
            switch (random.nextInt(3)) {
                case 0:
                    jugadoresAux.add(new Oro("Jugador" + i, clubRandom, paisRandom));
                    break;
                case 1:
                    jugadoresAux.add(new Especial("Jugador" + i, clubRandom, paisRandom));
                    break;
                case 2:
                    jugadoresAux.add(new BronceEspecial("Jugador" + i, clubRandom, paisRandom, habilidadRandom));
                    break;
                default:
                    break;
            }
        }

        Plantilla plantilla1 = new Plantilla("Usuario 1", clubes[random.nextInt(clubes.length)],
                paises[random.nextInt(paises.length)]);
        Plantilla plantilla2 = new Plantilla("Usuario 2", clubes[random.nextInt(clubes.length)],
                paises[random.nextInt(paises.length)]);
        Collections.shuffle(jugadoresAux);
        Integer contador = 1;
        for (Jugador jugador : jugadoresAux) {
            if (contador <= 5) {
                plantilla1.addJugador(jugador);
            } else {
                plantilla2.addJugador(jugador);
            }
            contador += 1;
            // Si se necesita plantillas con menos jugadores
            // if (contador >= 10) {
            // break;
            // }
        }
        plantilla1.imprimirPlantel();
        System.out.println();
        plantilla2.imprimirPlantel();
    }

}