package org.example;

public class PrintWithComas {

    public void device(SmartPhone mobile) {
        System.out.println(mobile.getMarca() + ", "
                + mobile.getModelo() + ", "
                + mobile.getPantalla() + ", "
                + mobile.getPeso() + ", "
                + mobile.getPrecio() + ", "
                + mobile.getCSimCard());
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
