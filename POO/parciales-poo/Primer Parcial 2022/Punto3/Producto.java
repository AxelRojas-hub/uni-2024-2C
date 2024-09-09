package Punto3;

import java.util.Random;

public class Producto {
    protected String modelo;
    protected String marca;
    protected String color;
    protected Double precio;

    public Producto(String marca, String color, Double precio) {
        this.modelo = this.generarCodigoProducto();
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String generarCodigoProducto() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Integer longitudCodigo = 6;
        Random random = new Random();
        StringBuilder codigo = new StringBuilder(longitudCodigo);

        for (int i = 0; i < longitudCodigo; i++) {
            int index = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(index));
        }

        return codigo.toString();
    }
}
