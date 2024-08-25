package EJ8;

public class ProfesorTitular extends Profesor {

    private Integer antiguedad;

    public ProfesorTitular(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Integer antiguedad) {
        super(nombre, apellido, antiguedad, horasTrabajadas);
        this.antiguedad = antiguedad;
    }

    public Integer getAntiguedad() {
        return this.antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Double get_remuneracion_antiguedad() {
        return this.valorAntiguedad * this.getAntiguedad();
    }

    public Double get_remuneracion_mensual() {
        return this.valorHora * getHorasTrabajadas() * get_remuneracion_antiguedad();
    }

}
