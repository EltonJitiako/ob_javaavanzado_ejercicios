package org.example;

public class SmartWatchBuilder {


    SmartWatch smartWatch;

    private SmartWatchBuilder() {};
    public SmartWatchBuilder(String marca) {
        smartWatch = new SmartWatch(marca);
        smartWatch.marca = marca;
    }

    public SmartWatchBuilder setModelo(String modelo) {
        smartWatch.modelo = modelo;
        return this;
    }

    public SmartWatchBuilder setPantalla(double pantalla) {
        smartWatch.pantalla = pantalla;
        return this;
    }

    public SmartWatchBuilder setPeso(double peso) {
        smartWatch.peso = peso;
        return this;
    }

    public SmartWatchBuilder setPrecio(double precio) {
        smartWatch.precio = precio;
        return this;
    }

    public SmartWatchBuilder setColorCorrea(String colorCorrea) {
        smartWatch.colorCorrea = colorCorrea;
        return this;
    }

    public SmartWatch build() {
        return this.smartWatch;
    }
}
