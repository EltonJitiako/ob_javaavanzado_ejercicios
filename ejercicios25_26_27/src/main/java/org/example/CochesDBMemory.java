package org.example;

import java.util.ArrayList;
import java.util.Random;

public class CochesDBMemory implements CochesDB, CochesRandomData {

    ArrayList<Coche> coches = new ArrayList();

    public ArrayList<Coche> get() {
        return coches;
    }

    public Coche find(Coche coche) {
        for (Coche actualCoche : get()) {
            if (actualCoche.modelo.equalsIgnoreCase(coche.modelo)) {
                return coche;
            }
        }

        return null;
    }
    public void set(Coche coche) {
        for (Coche actualCoche : coches) {
            if (actualCoche.modelo.toLowerCase().equals(actualCoche.modelo.toLowerCase())) {
                return;
            }
        }

        coches.add(coche);
        //incrementarInserciones();
    }

    public void delete(Coche coche) {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).modelo.equalsIgnoreCase(coche.modelo)) {
                coches.remove(i);
            }
        }

        //incrementarEliminaciones();
    }

    public void random() {
        ArrayList<Coche> coches = get();
        int randomCoche = new Random().nextInt(coches.size()-1);
        int randomData = new Random().nextInt(4);
        switch (randomData) {
            case 0:
                System.out.println("Un dato random de un coche random: " + "Marca " + coches.get(randomCoche).marca);
                break;
            case 1:
                System.out.println("Un dato random de un coche random: " + "Modelo " +  coches.get(randomCoche).modelo);
                break;
            case 2:
                System.out.println("Un dato random de un coche random: " + "Potencia " + coches.get(randomCoche).potencia);
                break;
            case 3:
                System.out.println("Un dato random de un coche random: " + "Numero Puertas " + coches.get(randomCoche).numPortas);
                break;
            case 4:
                System.out.println("Un dato random de un coche random: " + "Aire Cond. " + coches.get(randomCoche).airCon);
        }

    }
}
