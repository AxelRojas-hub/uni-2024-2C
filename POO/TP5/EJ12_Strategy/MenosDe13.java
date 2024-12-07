package EJ12_Strategy;

import java.util.List;

public class MenosDe13 implements Estrategia {
    @Override
    public void mostrarCatalogo(List<Pelicula> peliculas) {
        System.out.println("\n      Catalogo para menores de 13\n");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getEdadMinima() < 13) {
                System.out.println(pelicula.toString());
            }
        }
    }
}
