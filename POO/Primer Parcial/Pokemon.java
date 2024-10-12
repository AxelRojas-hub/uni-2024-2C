import java.util.Random;

public abstract class Pokemon {
    protected String tipo;
    protected String nombre;
    protected Integer ataque;
    protected Integer defensa;
    protected Integer velocidad;
    protected Integer salvajismo;
    protected String debilidad;
    protected Integer vida = 100;
    // Rango de 0 a 100

    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.setAtributosRandom();
    }

    public void ataque(Pokemon oponente) {
        Integer ataque = this.ataque;
        Random random = new Random();
        // Ataque critico 70%
        Boolean esCritico = (random.nextInt(101) >= 70);
        // Si el op tiene debilidad a este tipo
        if (oponente.debilidad.equals(this.tipo) && esCritico) {
            // Aumenta ataque en 50%
            ataque = (int) (ataque * 1.5);
        }
        oponente.defensa(ataque);
    };

    public void intentoCaptura() {
        this.salvajismo = (int) (this.salvajismo * 0.9);
    }

    public void recibirDaño(Integer ataque) {
        if (ataque > this.defensa) {
            Integer daño = ataque - this.defensa;
            this.vida -= daño;
        }
    }

    public abstract void defensa(Integer ataque);

    public void setAtributosRandom() {
        Random random = new Random();
        this.ataque = random.nextInt(101);
        this.defensa = random.nextInt(101);
        this.velocidad = random.nextInt(101);
        this.salvajismo = random.nextInt(101);
    };

    public void imprimirDatos() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Ataque: " + this.getAtaque());
        System.out.println("Defensa: " + this.getDefensa());
        System.out.println("Velocidad: " + this.getVelocidad());
        System.out.println("Salvajismo: " + this.getSalvajismo() + "\n");
    };

    // GETTERS Y SETTERS
    public Integer getVida() {
        return this.vida;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getSalvajismo() {
        return salvajismo;
    }

    public void setSalvajismo(Integer salvajismo) {
        this.salvajismo = salvajismo;
    }
}
