package EJ9;

public class Personal extends TarifaProveedor {
    private String nombre;

    public Personal(String nombre) {
        super();
        this.minutosLlamada = this.minutosLlamada * 1.20;
        this.gigasInternet = this.gigasInternet * 1.50;
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
