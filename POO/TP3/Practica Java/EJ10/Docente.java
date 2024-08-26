package EJ10;

public class Docente extends Personal {
    private String categoria;
    private Double horasCorrespondientes;

    public Docente(String nombreCompleto, Integer antiguedad, String sector, Double horasTrabajadas, String categoria) {
        super(nombreCompleto, antiguedad, sector, horasTrabajadas);
        this.categoria = categoria;
        this.setHorasCorrespondientes(categoria);
    }

    public void setHorasCorrespondientes(String categoria) {
        switch (categoria.toLowerCase()) {
            // 4.34524 semanas = 1 mes
            case "simple":
                this.horasCorrespondientes = 10.0 * 4.34524;
                break;
            case "semiexclusiva":
                this.horasCorrespondientes = 20 * 4.34524;
                break;
            case "exclusiva":
                this.horasCorrespondientes = 20 * 4.34524;
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

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        String primeraLinea = "Nombre: " + this.nombreCompleto + "\t" + "\tSector: " + this.sector + "\n";
        String horas = String.format("\tHoras trabajadas: %.2f%n", this.horasTrabajadas);
        String segundaLinea = "Años de antiguedad: " + this.antiguedad + "\t" + horas;
        String terceraLinea = "Categoria: " + this.categoria + "\t" + "\tHoras correspondientes: "
                + Math.floor(this.horasCorrespondientes);
        return primeraLinea + segundaLinea + terceraLinea;
    }
}
