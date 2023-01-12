package org.example;

import java.util.ArrayList;

public class Coches {

    CochesDB cochesDB;

    public Coches(CochesDB cochesDB) {
        this.cochesDB = cochesDB;
    }

    protected Coches () {}

    public ArrayList<Coche> listAllCoches() {
        return cochesDB.get();
    }

    public Coche getCoche(String modelo) {
        Coche coche = new CocheCombustible();
        coche.modelo = modelo;

        return cochesDB.find(coche);
    }

    public void setCoche(Coche coche) {
        if (cochesDB.find(coche) != null) {
            return;
        }

        cochesDB.set(coche);
    }

    public void deleteCoche (String modelo) {
        Coche coche = new CocheCombustible();
        coche.modelo = modelo;

        cochesDB.delete(coche);
    }

}
