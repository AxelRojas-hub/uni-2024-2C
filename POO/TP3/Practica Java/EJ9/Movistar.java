package EJ9;

public class Movistar extends TarifaProveedor {
    private String nombre;

    public Movistar(String nombre) {
        super();
        this.sms = this.sms * 1.10;
        this.minutosLlamada = this.minutosLlamada * 1.20;
        this.gigasInternet = this.gigasInternet * 1.30;
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
