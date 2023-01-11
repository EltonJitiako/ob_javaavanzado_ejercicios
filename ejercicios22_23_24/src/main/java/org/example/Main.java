package org.example;

/**
 * Durante estos ejercicios se va a trabajar sobre las letras S, O y L de los principios SOLID, deberás:
 * Crea una clase coche aplicándole el principio de responsabilidad única (S).
 * Continúa con el código extendiéndolo para aumentar su funcionalidad pero sin modificarlo aplicando el principio abierto/cerrado(O).
 * Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible y uno híbrido y aplica el principio de substitución de Liskov (L), las subclases deben ser sustituibles por la superclase coche.
 */
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new CocheCombustible();
        coche1.marca = "Citroen";
        coche1.modelo = "C3";
        coche1.potencia = 1.2;
        coche1.numPortas = 2;
        coche1.airCon = false;

        Coche coche2 = new CocheElectrico();
        coche2.marca = "Audi";
        coche2.modelo = "A5";
        coche2.potencia = 2.4;
        coche2.numPortas = 4;
        coche2.airCon = true;

        Coche coche3 = new CocheHibrido();
        coche3.marca = "FIAT";
        coche3.modelo = "500";
        coche3.potencia = 1.0;
        coche3.numPortas = 2;
        coche3.airCon = true;

        CochesDB cochesDB = new CochesDB();

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

    }
}