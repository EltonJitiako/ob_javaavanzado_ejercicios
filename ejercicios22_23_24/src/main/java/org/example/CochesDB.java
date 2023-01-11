package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

abstract class CochesDB {

    abstract ArrayList<Coche> get();
    abstract Coche find(Coche coche);
    abstract void set(Coche coche);
    abstract void delete(Coche coche);
}

