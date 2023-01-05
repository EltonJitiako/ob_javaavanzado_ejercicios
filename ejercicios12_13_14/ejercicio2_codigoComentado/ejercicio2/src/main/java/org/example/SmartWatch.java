package org.example;

public class SmartWatch extends SmartDevice {

    String sColorCorrea;

    private SmartWatch () {}

    public SmartWatch(String sMarca) { this.sMarca = sMarca; }

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

    public String getColorCorrea() {
        return sColorCorrea;
    }

}
