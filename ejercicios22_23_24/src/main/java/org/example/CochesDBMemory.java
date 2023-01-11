package org.example;

import java.util.ArrayList;

public class CochesDBMemory extends CochesDB {
    ArrayList<Coche> coches = new ArrayList();

    @Override
    public ArrayList<Coche> get() {
        return coches;
    }

    @Override
    public Coche find(Coche coche) {
        for (Coche actualCoche : get()) {
            if (actualCoche.getModelo().equalsIgnoreCase(coche.getModelo())) {
                return coche;
            }
        }

        return null;
    }

    @Override
    public void set(Coche coche) {
        for (Coche actualCoche : coches) {
            if (actualCoche.getModelo().toLowerCase().equals(coche.getModelo().toLowerCase())) {
                return;
            }
        }

        coches.add(coche);
    }

    @Override
    public void delete(Coche coche) {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getModelo().equalsIgnoreCase(coche.getModelo())) {
                coches.remove(i);
            }
        }

    }
}
