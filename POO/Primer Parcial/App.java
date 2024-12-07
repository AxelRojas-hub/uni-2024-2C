import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Crear 10 pokemon diferentes aleatoria
        Pokemon[] pokemons = new Pokemon[10];
        Random random = new Random();

        for (int i = 0; i < pokemons.length; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    pokemons[i] = new Hierba("Pokemon" + i);
                    break;
                case 1:
                    pokemons[i] = new Fuego("Pokemon" + i);
                    break;
                case 2:
                    pokemons[i] = new Agua("Pokemon" + i);
                    break;
                default:
                    break;
            }
        }
        // Que el entrenador intente atraparlos
        Pokemon pokemonPrincipal = pokemons[random.nextInt(pokemons.length)];
        Entrenador entrenador = new Entrenador("Entrenador", pokemonPrincipal);
        for (int i = 0; i < pokemons.length; i++) {
            entrenador.atraparPokemon(pokemons[i]);
        }
        // Al finalizar intentos de captura mostrar
        // Datos de entrenador: nombre, nivel
        // Lista de pokemon atrapados en pokedex
        entrenador.imprimirDatos();
    }
}
