package Punto3;

public class Cocina extends Producto {
    private boolean esElectrica;

    public Cocina(String marca, String color, Double precio, boolean esElectrica) {
        super(marca, color, precio);
        this.esElectrica = esElectrica;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

}
