package org.example;

import java.util.ArrayList;

abstract class CochesDB {

    abstract ArrayList<Coche> get();
    abstract Coche find(Coche coche);
    abstract void set(Coche coche);
    abstract void delete(Coche coche);
}

