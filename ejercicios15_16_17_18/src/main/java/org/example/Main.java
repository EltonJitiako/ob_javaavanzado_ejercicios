package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * En estos ejercicios vas a trabajar sobre las excepciones, tendréis que implementar:
 * Arithmetic exception tratando de hacer una división entre dos números, siendo el que divide 0.
 * ArrayIndexOutOfBounds con un array de 6 elementos, tratando de alcanzar el noveno elemento.
 * FileNotFound tratando de acceder a un fichero que no existe.
 */
public class Main {
    public static void main(String[] args) {

        divisionByZero();

        outOfBound();

        fileNotFound();

    }

    public static void divisionByZero() {

        try {

            int result = 3/0;

        } catch (ArithmeticException e) {

            System.out.println("Division by zero: " + e.getMessage());

        }
    }

    public static void outOfBound() {

        int array[] = {1,2,3,4,5,6};

        try {

            System.out.println(array[9]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array out of bound: " + e.getMessage());

        }
    }

    public static void fileNotFound() {

        try {

            InputStream in = new FileInputStream("file.txt");

        } catch (FileNotFoundException e) {

            System.out.println("File not found: " + e.getMessage());

        }

    }

}