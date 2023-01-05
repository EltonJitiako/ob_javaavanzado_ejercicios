package org.example;

public class SmartPhoneBuilder {
    SmartPhone smartPhone;

    private SmartPhoneBuilder() {};
    public SmartPhoneBuilder(String sMarca) {
        smartPhone = new SmartPhone(sMarca);
        smartPhone.sMarca = sMarca;
    }

    public SmartPhoneBuilder setModelo(String sModelo) {
        smartPhone.sModelo = sModelo;
        return this;
    }

    public SmartPhoneBuilder setPantalla(double dPantalla) {
        smartPhone.dPantalla = dPantalla;
        return this;
    }

    public SmartPhoneBuilder setPeso(double dPeso) {
        smartPhone.dPeso = dPeso;
        return this;
    }

    public SmartPhoneBuilder setPrecio(double dPrecio) {
        smartPhone.dPrecio = dPrecio;
        return this;
    }

    public SmartPhoneBuilder setSimCard(String sSimCard) {
        smartPhone.sSimCard = sSimCard;
        return this;
    }

    public SmartPhone build() {
        return this.smartPhone;
    }
}
