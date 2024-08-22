import java.util.Random;

public abstract class Personaje {
    private Integer vida = 100;
    private Integer nivelAtaque;
    private Integer nivelDefensa;

    public Integer getVida() {
        return this.vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getNivelAtaque() {
        return this.nivelAtaque;
    }

    public void setNivelAtaque(Integer nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public Integer getNivelDefensa() {
        return this.nivelDefensa;
    }

    public void setNivelDefensa(Integer nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public Integer atacar() {
        Integer ataqueRandom = new Random().nextInt(100);
        return ataqueRandom;
    }

    public abstract Integer defender();

}
