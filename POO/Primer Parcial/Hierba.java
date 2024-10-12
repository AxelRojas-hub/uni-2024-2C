import java.util.Random;

public class Hierba extends Pokemon {
    public Hierba(String nombre) {
        super(nombre);
        this.debilidad = "fuego";
        this.tipo = "hierba";
    }

    // Debilidad Fuego
    public void defensa(Integer ataque) {
        Random random = new Random();
        // Si velocidad > 50 tiene 50% evadir
        Boolean evade = this.velocidad > 50 && random.nextInt(101) >= 50;
        if (!(evade)) {
            // Si velocidad <= 50 recibe ataque completo
            this.recibirDaño(ataque);
        }
    };
}