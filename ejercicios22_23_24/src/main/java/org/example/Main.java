package org.example;

/**
 * Durante estos ejercicios se va a trabajar sobre las letras S, O y L de los principios SOLID, deberás:
 * Crea una clase coche aplicándole el principio de responsabilidad única (S).
 * Continúa con el código extendiéndolo para aumentar su funcionalidad pero sin modificarlo aplicando el principio abierto/cerrado(O).
 * Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible y uno híbrido y aplica el principio de substitución de Liskov (L), las subclases deben ser sustituibles por la superclase coche.
 */
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche.Builder()
                .setMarca("Citroen")
                .setModelo("C3")
                .setPotencia(1.2)
                .setNumPortas(2)
                .setAirCon(false)
                .build();

        Coche coche2 = new Coche.Builder()
                .setMarca("Audi")
                .setModelo("A5")
                .setPotencia(2.4)
                .setNumPortas(4)
                .setAirCon(true)
                .build();

        Coche coche3 = new Coche.Builder()
                .setMarca("FIAT")
                .setModelo("500")
                .setPotencia(1.0)
                .setNumPortas(2)
                .setAirCon(true)
                .build();

        CochesDB cochesDB;

        cochesDB = new CochesDBFile();

        Coches coches = new Coches(cochesDB);
        coches.setCoche(coche1);
        coches.setCoche(coche2);
        coches.setCoche(coche3);

        Coche marcaCoche = coches.getCoche("C3");
        System.out.println("Marca de coche obtenido: " + marcaCoche.getMarca());
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

    }
}