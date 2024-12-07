package EJ5_Builder;

public class Torta {
    private final String nombre;
    private String masa;
    private String relleno;

    public Torta(String nombre) {
        this.nombre = nombre;

    };

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    };

    @Override
    public String toString() {
        return nombre + "\nMasa: " + masa + "\nRelleno: " + relleno + "\n";
    }
}