package EJ8;

public class ProfesorSuplente extends Profesor {
    public ProfesorSuplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
        super(nombre, apellido, edad, horasTrabajadas);
    }

    public Double get_remuneracion_mensual() {
        return this.valorHora * this.getHorasTrabajadas();
    }

    public Integer getHorasTrabajadas() {
        return this.horasTrabajadas;
    }
}
