public class Fuego extends Pokemon {
    public Fuego(String nombre) {
        // llamada al super
        super(nombre);
        this.debilidad = "agua";
        this.tipo = "fuego";
    }

    public void defensa(Integer ataque) {
        this.recibirDaño(ataque);
    };
}
