package org.example;

public class Main {
    public static void main(String[] args) {

        /**
         * Calculo da area circular
         * Notacion Hungara
         */
        final double kdPI = 3.14;
        double dRaio = 13.0;

        System.out.println(calcularAreaCircular(kdPI, dRaio));

        /**
         * Anadir un estudiante y verificar que sea major que 16 anos.
         */
        Estudiantes estudiantes = new Estudiantes();

        Estudiante estudiante1 = new Estudiante();
        estudiante1.sNombre = "Carlos";
        estudiante1.iEdad = 22;
        estudiante1.sCurso = "Historia";

        Estudiante estudiante2 = new Estudiante();
        estudiante2.sNombre = "Helena";
        estudiante2.iEdad = 15;
        estudiante2.sCurso = "Medicina";

        Estudiante estudiante3 = new Estudiante();
        estudiante3.sNombre = "Miguel";
        estudiante3.iEdad = 18;
        estudiante3.sCurso = "TI";
        try {
            estudiantes.anadirEstudiante(estudiante1, estudiante2, estudiante3);
        } catch (EstudianteEdadException e) {
            System.out.println("Error: " + e);
        }





    }

    /**
     * Funcion para Calcular Area Circular
     *
     * @param kdPI
     * @param dRaio
     * @return
     */
    private static double calcularAreaCircular(double kdPI, double dRaio) {
        return kdPI * dRaio;
    }

}