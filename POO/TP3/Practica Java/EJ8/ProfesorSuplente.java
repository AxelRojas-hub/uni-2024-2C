package EJ8;

public class ProfesorSuplente {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer horasTrabajadas;
    private Double valorHora = 200.00;

    public ProfesorSuplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double get_remuneracion_mensual() {
        return this.valorHora * this.getHorasTrabajadas();
    }

    public Integer getHorasTrabajadas() {
        return this.horasTrabajadas;
    }
}
