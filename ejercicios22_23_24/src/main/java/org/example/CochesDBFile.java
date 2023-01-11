package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CochesDBFile extends CochesDB{

    public String file = "coches.txt";


    @Override
    public ArrayList<Coche> get() {
        ArrayList<Coche> coches = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(file));

            while (scanner.hasNext()) {
                String actualCoche = scanner.next();
                String []elements = actualCoche.split(",");

                Coche coche = new Coche.Builder().build();
                coche.setMarca(elements[0]);
                coche.setModelo(elements[1]);
                coche.setPotencia(Double.parseDouble(elements[2]));
                coche.setNumPortas(Integer.parseInt(elements[3]));
                coche.setAirCon(Boolean.parseBoolean(elements[4]));

                coches.add(coche);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }

        return coches;
    }

    @Override
    public Coche find(Coche coche) {
        ArrayList<Coche> coches = get();

        for (Coche actualCoche : coches) {
            if (actualCoche.getModelo().equalsIgnoreCase(coche.getModelo())) {
                return actualCoche;
            }
        }

        return null;
    }

    @Override
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

    @Override
    public void delete(Coche coche) {
        ArrayList<Coche> coches = get();

        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getModelo().equalsIgnoreCase(coche.getModelo())) {
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
        return coche.getMarca() + ","
                + coche.getModelo() + ","
                + coche.getPotencia() + ","
                + coche.getNumPortas() + ","
                + coche.getAirCon();
    }

}
