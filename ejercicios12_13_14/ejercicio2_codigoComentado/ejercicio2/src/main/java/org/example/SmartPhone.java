package org.example;

public class SmartPhone extends SmartDevice {
    String simCard;

    private SmartPhone() {}

    public SmartPhone(String marca) { this.marca = marca; }

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

    public String getCSimCard() { return simCard; }
}
