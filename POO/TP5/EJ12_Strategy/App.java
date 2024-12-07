package EJ12_Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// En una plataforma de streaming de películas se desea consultar el catálogo.
// Sin embargo hay diferentes situaciones que podrían llevar a qué el sea filtrado de diferentes formas,un ejemplo de ello es cuando la cuenta que está usando el sistema pertenece a un niño.
// En este caso el catálogo solo debe mostrar películas que no sean para mayores de 13 años.

// Utilizando el patrón strategy defina una estrategia general que retorne el catálogo completo y luego una estrategia para niños que filtra las películas por edad
// Escriba en consola el listado implementando la estrategia para todo el catálogo.Luego imprima el listado usando la estrategia para menores de 13.

// Finalmente,implemente una tercera estrategia que retorne el catálogo de películas para menores de 18 años.Compruebe el resultado en consola.

public class App {
    public static void main(String[] args) {
        // Crea listado de peliculas
        List<Pelicula> peliculas = new ArrayList<Pelicula>();
        Integer[] edades = { 0, 13, 18 };
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            peliculas.add(new Pelicula("Pelicula " + i, edades[random.nextInt(edades.length)]));
        }
        Plataforma plataforma = new Plataforma(peliculas);
        plataforma.mostrarPeliculas(); // Por defecto muestra todas las peliculas, usando la estrategia Atp
        plataforma.setEstrategia(new MenosDe13());
        plataforma.mostrarPeliculas();
        plataforma.setEstrategia(new MenosDe18());
        plataforma.mostrarPeliculas();
    }
}
