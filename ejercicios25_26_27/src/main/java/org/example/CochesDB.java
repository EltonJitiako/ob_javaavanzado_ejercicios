package org.example;

import java.util.ArrayList;

interface CochesDB {

    ArrayList<Coche> get();
    Coche find(Coche coche);
    void set(Coche coche);
    void delete(Coche coche);

}

