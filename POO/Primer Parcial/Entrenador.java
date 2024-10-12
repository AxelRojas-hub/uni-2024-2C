import java.util.ArrayList;
import java.util.Random;

public class Entrenador {
    private String nombre;
    private Pokemon pokemonPrincipal;
    private Integer nivelEntrenador;
    private ArrayList<Pokemon> pokedex;

    public Entrenador(String nombre, Pokemon pokemonPrincipal) {
        Random random = new Random();
        this.nombre = nombre;
        this.pokemonPrincipal = pokemonPrincipal;
        this.pokedex = new ArrayList<>();
        this.nivelEntrenador = random.nextInt(101);
    }

    public void atraparPokemon(Pokemon pokemon) {
        // Nivel entrenador > salvajismo del pokemon
        Boolean atrapable = this.nivelEntrenador > pokemon.getSalvajismo();
        if (atrapable) {
            this.addPokemon(pokemon);
        } else {
            // Puede atacar 3 veces para disminuir salvajismo
            // Cada ataque disminuye 10%
            // Si pierde toda la vida no podra ser atrapado
            for (int cantAtaques = 0; cantAtaques < 3; cantAtaques++) {
                this.pokemonPrincipal.ataque(pokemon);
                pokemon.intentoCaptura(); // Resto 10% salvajismo
                // Despues de cada ataque se debe comprobar si capturable
                if (atrapable && pokemon.getVida() > 0) {
                    this.addPokemon(pokemon);
                    break;
                }
            }
        }
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokedex.add(pokemon);
    }

    public void imprimirDatos() {
        System.out.println("Entrenador");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Nivel: " + this.getNivelEntrenador());
        System.out.println("Pokemons en pokedex\n-------------------");
        for (Pokemon pokemon : pokedex) {
            System.out.println(pokemon.getNombre());
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getNivelEntrenador() {
        return nivelEntrenador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pokemon getPokemonPrincipal() {
        return this.pokemonPrincipal;
    }

    public void setPokemonPrincipal(Pokemon pokemonPrincipal) {
        this.pokemonPrincipal = pokemonPrincipal;
    }

    public ArrayList<Pokemon> getPokedex() {
        return this.pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }
}
