package EJ12_Strategy;

import java.util.List;

public class Atp implements Estrategia {
    @Override
    public void mostrarCatalogo(List<Pelicula> peliculas) {
        System.out.println("\n\tMostrando catalogo ATP\n");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
}