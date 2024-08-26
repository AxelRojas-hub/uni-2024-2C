package EJ10;

public class NoDocente extends Personal {
    private String tipoJornada;
    private Double horasCorrespondientes;

    public NoDocente(String nombreCompleto, Integer antiguedad, String sector, Double horasTrabajadas,
            String tipoJornada) {
        super(nombreCompleto, antiguedad, sector, horasTrabajadas);
        this.tipoJornada = tipoJornada;
        this.setHorasCorrespondientes(tipoJornada);
    }

    public void setHorasCorrespondientes(String tipoJornada) {
        switch (tipoJornada.toLowerCase()) {
            case "completa":
                this.horasCorrespondientes = 30.0 * 4.34524;
                break;
            case "reducida":
                this.horasCorrespondientes = 20.0 * 4.34524;
                break;
            default:
                this.horasCorrespondientes = 0.0;
                break;
        }
    }

    public Double getHorasCorrespondientes() {
        return this.horasCorrespondientes;
    }

    public void setHorasCorrespondientes(Double horasCorrespondientes) {
        this.horasCorrespondientes = horasCorrespondientes;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public String toString() {
        String primeraLinea = "Nombre: " + this.nombreCompleto + "\t" + "\tSector: " + this.sector + "\n";
        String horas = String.format("\tHoras trabajadas: %.2f%n", this.horasTrabajadas);
        String segundaLinea = "Años de antiguedad: " + this.antiguedad + "\t" + horas;
        String terceraLinea = "Tipo de Jornada: " + this.tipoJornada + "\t" + "Horas correspondientes: "
                + Math.floor(this.horasCorrespondientes);
        return primeraLinea + segundaLinea + terceraLinea;
    }
}
