package ejercicio4;

public class SmartDevice {
    
    String marca;
    String modelo;
    double pantalla;
    double peso;
    double precio;

}

class SmartPhone extends SmartDevice {

    String simCard;

    public SmartPhone () {
    }

    public SmartPhone (String marca, String modelo, double pantalla, double peso, double precio, String simCard) {

        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.peso = peso;
        this.precio = precio;
        this.simCard = simCard;

    }

}

class SmartWatch extends SmartDevice {
    String colorCorrea;

    public SmartWatch () {
    }

    public SmartWatch (String marca, String modelo, double pantalla, double peso, double precio, String colorCorrea) {

        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.peso = peso;
        this.precio = precio;
        this.colorCorrea = colorCorrea;

    }

}
