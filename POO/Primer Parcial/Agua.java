import java.util.Random;

public class Agua extends Pokemon {
    public Agua(String nombre) {
        super(nombre);
        this.debilidad = "hierba";
        this.tipo = "agua";
    }

    // Debilidad Hierba
    @Override
    public void ataque(Pokemon oponente) {
        // Debe enviar daño y tipo del pokemon atacante
        Integer ataque = this.ataque;
        // Si el op tiene debilidad a este tipo
        if (oponente.debilidad.equals(this.tipo)) {
            // Aumenta ataque en 50%
            ataque = (int) (ataque * 1.5);
        }
        oponente.defensa(ataque);
    };

    public void defensa(Integer ataque) {
        // 30% posibilidad reducirDaño 50%
        // Tener en cuenta nivelDefensa
        Random random = new Random();
        Boolean reduceDaño = random.nextInt(101) >= 30;
        if (reduceDaño) {
            ataque = ataque / 2;
            this.recibirDaño(ataque);
        } else {
            this.recibirDaño(ataque);
        }
    };
}
