package Punto3;

public class Heladera extends Producto {
    private Double capacidadTotal;
    private Double capacidadFreezer;

    public Heladera(String marca, String color, Double precio, Double capacidadTotal,
            Double capacidadFreezer) {
        super(marca, color, precio);
        this.capacidadTotal = capacidadTotal;
        this.capacidadFreezer = capacidadFreezer;
    }

    public Double getCapacidadTotal() {
        return this.capacidadTotal;
    }

    public void setCapacidadTotal(Double capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public Double getCapacidadFreezer() {
        return this.capacidadFreezer;
    }

    public void setCapacidadFreezer(Double capacidadFreezer) {
        this.capacidadFreezer = capacidadFreezer;
    }
}
