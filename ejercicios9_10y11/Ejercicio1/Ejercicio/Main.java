package ejercicio4.Ejercicio;


/**
 * Ejercicios 9, 10 y 11 - Java Avanzado - Ejercicio 1;
 * Ejercicio retirado del curso de Java Basico - Ejercicio 4
 * El Patron de Comportamiento elegido fue Builder, una vez que en este ejercicio tiene muchos atributos.
 * Con el patron elegido es más sencillo la atribuición de valores.
 */
public class Main {
    public static void main(String[] args) {
        
        SmartPhone mobile1 = new SmartPhone();

        System.out.println(mobile1.marca + ", "
                            + mobile1.modelo + ", "
                            + mobile1.pantalla + ", "
                            + mobile1.peso + ", "
                            + mobile1.precio + ", "
                            + mobile1.simCard);

        SmartPhone mobile2 = new SmartPhone("Apple", "iPhone14" , 6.7, 300.0, 1000.00, "eSim");

        System.out.println(mobile2.marca + ", "
                            + mobile2.modelo + ", "
                            + mobile2.pantalla + ", "
                            + mobile2.peso + ", "
                            + mobile2.precio + ", "
                            + mobile2.simCard);

        SmartWatch watch1 = new SmartWatch();

        System.out.println(watch1.marca + ", "
                            + watch1.modelo + ", "
                            + watch1.pantalla + ", "
                            + watch1.peso + ", "
                            + watch1.precio + ", "
                            + watch1.colorCorrea);

        SmartWatch watch2 = new SmartWatch("Samsung", "Galaxy watch 4", 2.0, 60.0, 400.00, "gris");

        System.out.println(watch2.marca + ", "
                            + watch2.modelo + ", "
                            + watch2.pantalla + ", "
                            + watch2.peso + ", "
                            + watch2.precio + ", "
                            + watch2.colorCorrea);

    }
}

