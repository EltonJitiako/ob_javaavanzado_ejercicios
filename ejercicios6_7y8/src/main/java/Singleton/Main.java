package Singleton;

public class Main {
    public static void main(String []args) {
        EdadPerroCalc juanEdad = EdadPerroCalc.getInstance();
        juanEdad.setCalc(25);
        System.out.println("La edad de Juan en edad de perro es: " + juanEdad.getCalc() + " anos");

        EdadPerroCalc pedroEdad = EdadPerroCalc.getInstance();
        pedroEdad.setCalc(41);
        System.out.println("La edad de Pedro en edad de perro es: " + pedroEdad.getCalc() + " anos");


    }
}
