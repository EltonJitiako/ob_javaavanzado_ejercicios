package org.example;

public class SmartWatchBuilder {


    SmartWatch smartWatch;

    private SmartWatchBuilder() {};
    public SmartWatchBuilder(String sMarca) {
        smartWatch = new SmartWatch(sMarca);
        smartWatch.sMarca = sMarca;
    }

    public SmartWatchBuilder setModelo(String sModelo) {
        smartWatch.sModelo = sModelo;
        return this;
    }

    public SmartWatchBuilder setPantalla(double dPantalla) {
        smartWatch.dPantalla = dPantalla;
        return this;
    }

    public SmartWatchBuilder setPeso(double dPeso) {
        smartWatch.dPeso = dPeso;
        return this;
    }

    public SmartWatchBuilder setPrecio(double dPrecio) {
        smartWatch.dPrecio = dPrecio;
        return this;
    }

    public SmartWatchBuilder setColorCorrea(String sColorCorrea) {
        smartWatch.sColorCorrea = sColorCorrea;
        return this;
    }

    public SmartWatch build() {
        return this.smartWatch;
    }
}
