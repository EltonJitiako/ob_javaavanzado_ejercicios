package org.example;

public class Coche {
    private String marca;
    private String modelo;
    private double potencia;
    private int numPortas;
    private boolean airCon;

    // constructores
    public Coche(String marca, String modelo, double potencia, int numPortas, boolean airCon) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.numPortas = numPortas;
        this.airCon = airCon;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public boolean getAirCon() {
        return airCon;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void setAirCon(boolean airCon) {
        this.airCon= airCon;
    }

    public static class Builder {

        private String marca;
        private String modelo;
        private double potencia;
        private int numPortas;
        private boolean airCon;

        Coche build() {
            return new Coche(this.marca, this.modelo, this.potencia, this.numPortas, this.airCon);
        }

        public String getMarca() { return marca; }

        public String getModelo() {
            return modelo;
        }

        public double getPotencia() {
            return potencia;
        }

        public int getNumPortas() {
            return numPortas;
        }

        public boolean getAirCon() {
            return airCon;
        }

        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder setPotencia(double potencia) {
            this.potencia = potencia;
            return this;
        }

        public Builder setNumPortas(int numPortas) {
            this.numPortas = numPortas;
            return this;
        }

        public Builder setAirCon(boolean airCon) {
            this.airCon= airCon;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\r\n"
                + "Modelo: " + modelo + "\r\n"
                + "Potencia: " + potencia + "\r\n"
                + "Numero de Portas: " + numPortas + "\r\n"
                + "Aire Cond.: " + airCon;
    }


}
