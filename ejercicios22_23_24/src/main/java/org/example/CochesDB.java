package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CochesDB {

    public String file = "coches.txt";

    public ArrayList<Coche> get() {
        ArrayList<Coche> coches = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(file));

            while (scanner.hasNext()) {
                String actualCoche = scanner.next();
                String []elements = actualCoche.split(",");

                Coche coche = new CocheCombustible();
                coche.marca = elements[0];
                coche.modelo = elements[1];
                coche.potencia = Double.parseDouble(elements[2]);
                coche.numPortas = Integer.parseInt(elements[3]);
                coche.airCon = Boolean.parseBoolean(elements[4]);

                coches.add(coche);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }

        return coches;
    }


    public Coche find(Coche coche) {
        ArrayList<Coche> coches = get();

        for (Coche actualCoche : coches) {
            if (actualCoche.modelo.equalsIgnoreCase(coche.modelo)) {
                return actualCoche;
            }
        }

        return null;
    }


    public void set(Coche coche) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(separarPorComas(coche));
            printStream.flush();
            printStream.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }
    }


    public void delete(Coche coche) {
        ArrayList<Coche> coches = get();

        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).modelo.equalsIgnoreCase(coche.modelo)) {
                coches.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(file);

            for (Coche actualCoche : coches) {
                String cocheConComas = separarPorComas(actualCoche);
                printStream.println(cocheConComas);
            }

            printStream.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }
    }

    private String separarPorComas(Coche coche) {
        return coche.marca + ","
                + coche.modelo + ","
                + coche.potencia + ","
                + coche.numPortas + ","
                + coche.airCon;
    }

}

