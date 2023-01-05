package org.example;

/**
 * Clase hija de SmartDevice. Recibe los atributos de lo padre y anadi mas atributos.
 */
public class SmartPhone extends SmartDevice {
    String sSimCard;

    private SmartPhone() {}

    public SmartPhone(String sMarca) { this.sMarca = sMarca; }

    public String getMarca() {
        return sMarca;
    }

    public String getModelo() {
        return sModelo;
    }

    public double getPantalla() {
        return dPantalla;
    }

    public double getPeso() {
        return dPeso;
    }

    public double getPrecio() {
        return dPrecio;
    }

    public String getSimCard() { return sSimCard; }
}
