package org.example;

/**
 * Continúa con el proyecto de los anteriores ejercicios ahora se va a trabajar sobre las letras I y D de los principios SOLID, deberás:
 * Si no has creado interfaces ya, créalas siguiendo el principio de segregación de interfaz (I) el cual indica que las interfaces grandes se deben segregar en varias interfaces pequeñas. Si ya las has creado, modifícalas para que cumplan el principio.
 * Deberás crear una conexión a base de datos aplicando el último principio de la inversión de dependencias (D).
 */
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new CocheCombustible();
        coche1.marca = "Citroen";
        coche1.modelo = "C3";
        coche1.potencia = 1.2;
        coche1.numPortas = 2;
        coche1.airCon = false;
        coche1.printCoche();

        Coche coche2 = new CocheElectrico();
        coche2.marca = "Audi";
        coche2.modelo = "A5";
        coche2.potencia = 2.4;
        coche2.numPortas = 4;
        coche2.airCon = true;
        coche2.printCoche();

        Coche coche3 = new CocheHibrido();
        coche3.marca = "FIAT";
        coche3.modelo = "500";
        coche3.potencia = 1.0;
        coche3.numPortas = 2;
        coche3.airCon = true;
        coche3.printCoche();

        CochesDB cochesDB = new CochesDBFile();

        Coches coches = new Coches(cochesDB);
        coches.setCoche(coche1);
        coches.setCoche(coche2);
        coches.setCoche(coche3);

        Coche marcaCoche = coches.getCoche("C3");
        System.out.println("Marca de coche obtenido: " + marcaCoche.marca);
        System.out.println("**********************");

        coches.deleteCoche("A5");

        for (Coche a : coches.listAllCoches()) {
            System.out.println(a);
            System.out.println("**********************");
        }

        CochesConfort cochesComf = new CochesConfort();
        System.out.println("Este coche es muy confortable?  " + cochesComf.itIsSoConfortable(coche1));
        System.out.println("Este coche es confortable?      " + cochesComf.itIsConfortable(coche1));
        System.out.println("Este coche no es confortable?   " + cochesComf.itIsNotConfortable(coche1));

        if(cochesDB instanceof CochesDBFile) {
            ((CochesDBFile)cochesDB).random();
        } else {
            ((CochesDBMemory)cochesDB).random();
        }


    }
}