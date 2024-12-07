package EJ11_State;

public class Cliente {
    private String nombre;
    private Integer edad;

    public Cliente(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }
}
