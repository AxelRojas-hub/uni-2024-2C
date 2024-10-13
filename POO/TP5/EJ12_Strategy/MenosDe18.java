package EJ12_Strategy;

import java.util.List;

public class MenosDe18 implements Estrategia {
    @Override
    public void mostrarCatalogo(List<Pelicula> peliculas) {
        System.out.println("\n      Catalogo para menores de 18\n");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getEdadMinima() < 18) {
                System.out.println(pelicula.toString());
            }
        }
    }

}
