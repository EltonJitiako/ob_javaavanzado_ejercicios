package org.example;


/**
 * Ejercicios 9, 10 y 11 - ejercicio 2 Java Avanzado
 * Ejercicio extraido de ejercicio 4 Java Basico - "En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch. Agregaréis atributos tal cual tendrían esos objetos en la realidad. Crear constructor vacío y con todos los parámetros para cada clase. Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola."
 * *********************************************************
 * Refactorado con patron Builder y tambien fue hecho una clase PrintWithComas con sobrecarga para dejar sencillo la imprecion de los datos.
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


