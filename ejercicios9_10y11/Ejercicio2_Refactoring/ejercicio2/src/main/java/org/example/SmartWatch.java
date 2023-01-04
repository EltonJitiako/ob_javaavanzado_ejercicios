package org.example;

public class SmartWatch extends SmartDevice {

    String colorCorrea;

    private SmartWatch () {}

    public SmartWatch(String marca) { this.marca = marca; }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPantalla() {
        return pantalla;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColorCorrea() {
        return colorCorrea;
    }

}
