package org.example;

public class CochesConfort extends Coches{

    public CochesConfort() {}

    public boolean itIsSoConfortable(Coche coche) {
        return ConfortTest(coche, true, 4);
    }

    public boolean itIsConfortable(Coche coche) {
        return ConfortTest(coche, true, 2);
    }

    public boolean itIsNotConfortable(Coche coche) {
        return ConfortTest(coche, false, 2);
    }

    private boolean ConfortTest(Coche coche, boolean airCon, int numPortas) {
        if (coche.getAirCon() != airCon) {
            return false;
        }

        if (coche.getNumPortas() != numPortas) {
            return false;
        }

        return true;
    }
}
