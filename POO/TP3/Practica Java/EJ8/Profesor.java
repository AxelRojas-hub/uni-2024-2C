package EJ8;

public abstract class Profesor {
    protected String nombre;
    protected String apellido;
    protected Integer edad;
    protected Integer horasTrabajadas;
    protected Double valorAntiguedad = 1000.00;
    protected Double valorHora = 300.00;

    // Defino como abstract para que cada clase lo implemente segun necesite
    public abstract Double get_remuneracion_mensual();

    // Constructor
    public Profesor(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

}
