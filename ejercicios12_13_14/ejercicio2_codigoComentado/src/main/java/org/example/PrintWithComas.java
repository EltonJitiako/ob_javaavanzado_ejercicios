package org.example;

/**
 * Funciones para imprimir los atributos de los objetos con coma.
 */
public class PrintWithComas {

    public void device(SmartPhone mobile) {
        System.out.println(mobile.getMarca() + ", "
                + mobile.getModelo() + ", "
                + mobile.getPantalla() + ", "
                + mobile.getPeso() + ", "
                + mobile.getPrecio() + ", "
                + mobile.getSimCard());
    }

    public void device(SmartWatch mobile) {
        System.out.println(mobile.getMarca() + ", "
                + mobile.getModelo() + ", "
                + mobile.getPantalla() + ", "
                + mobile.getPeso() + ", "
                + mobile.getPrecio() + ", "
                + mobile.getColorCorrea());
    }

}
