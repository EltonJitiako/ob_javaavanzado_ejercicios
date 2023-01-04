package org.example;

public class SmartPhoneBuilder {
    SmartPhone smartPhone;

    private SmartPhoneBuilder() {};
    public SmartPhoneBuilder(String marca) {
        smartPhone = new SmartPhone(marca);
        smartPhone.marca = marca;
    }

    public SmartPhoneBuilder setModelo(String modelo) {
        smartPhone.modelo = modelo;
        return this;
    }

    public SmartPhoneBuilder setPantalla(double pantalla) {
        smartPhone.pantalla = pantalla;
        return this;
    }

    public SmartPhoneBuilder setPeso(double peso) {
        smartPhone.peso = peso;
        return this;
    }

    public SmartPhoneBuilder setPrecio(double precio) {
        smartPhone.precio = precio;
        return this;
    }

    public SmartPhoneBuilder setSimCard(String simCard) {
        smartPhone.simCard = simCard;
        return this;
    }

    public SmartPhone build() {
        return this.smartPhone;
    }
}
