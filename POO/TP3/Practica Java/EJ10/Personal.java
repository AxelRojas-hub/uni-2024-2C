package EJ10;

public abstract class Personal {
    protected String nombreCompleto;
    protected Integer antiguedad;
    protected String sector;
    protected Double horasTrabajadas;

    public abstract Double getHorasCorrespondientes();

    public Personal(String nombreCompleto, Integer antiguedad, String sector, Double horasTrabajadas) {
        this.nombreCompleto = nombreCompleto;
        this.antiguedad = antiguedad;
        this.sector = sector;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Double getHorasTrabajadas() {
        return this.horasTrabajadas;
    };

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

}
