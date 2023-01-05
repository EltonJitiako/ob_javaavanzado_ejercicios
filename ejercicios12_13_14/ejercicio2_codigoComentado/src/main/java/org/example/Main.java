package org.example;

/**
 * Codigo para anadir devices (SmartPhones y SmartWatches) en una lista.
 */
public class Main {

        public static void main(String[] args) {


                PrintWithComas print = new PrintWithComas();

                SmartPhone mobile1 = new SmartPhoneBuilder(null).build();

                print.device(mobile1);

                SmartPhone mobile2 = new SmartPhoneBuilder("Apple")
                        .setModelo("iPhone14")
                        .setPantalla(6.7)
                        .setPeso(300.0)
                        .setPrecio(1000.00)
                        .setSimCard("eSim")
                        .build();

                print.device(mobile2);

                SmartWatch watch1 = new SmartWatchBuilder(null).build();

                print.device(watch1);

                SmartWatch watch2 = new SmartWatchBuilder("Samsung")
                        .setModelo("Galaxy watch 4")
                        .setPantalla(2.0)
                        .setPeso(60.0)
                        .setPrecio(400.00)
                        .setColorCorrea("gris")
                        .build();

                print.device(watch2);

        }

}


