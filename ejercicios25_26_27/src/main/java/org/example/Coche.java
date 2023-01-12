package org.example;

abstract class Coche {
    public String marca;
    public String modelo;
    public double potencia;
    public int numPortas;
    public boolean airCon;

    abstract void printCoche();

    @Override
    public String toString() {
        return "Marca: " + marca + "\r\n"
                + "Modelo: " + modelo + "\r\n"
                + "Potencia: " + potencia + "\r\n"
                + "Numero de Portas: " + numPortas + "\r\n"
                + "Aire Cond.: " + airCon;
    }


}
