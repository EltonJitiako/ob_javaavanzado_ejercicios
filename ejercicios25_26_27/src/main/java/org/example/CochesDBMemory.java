package org.example;

import java.util.ArrayList;

public class CochesDBMemory implements CochesDB {

    ArrayList<Coche> coches = new ArrayList();

    @Override
    public ArrayList<Coche> get() {
        return coches;
    }

    @Override
    public Coche find(Coche coche) {
        for (Coche actualCoche : get()) {
            if (actualCoche.modelo.equalsIgnoreCase(coche.modelo)) {
                return coche;
            }
        }

        return null;
    }

    @Override
    public void set(Coche coche) {
        for (Coche actualCoche : coches) {
            if (actualCoche.modelo.toLowerCase().equals(actualCoche.modelo.toLowerCase())) {
                return;
            }
        }

        coches.add(coche);
        //incrementarInserciones();
    }

    @Override
    public void delete(Coche coche) {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).modelo.equalsIgnoreCase(coche.modelo)) {
                coches.remove(i);
            }
        }

        //incrementarEliminaciones();
    }
}
