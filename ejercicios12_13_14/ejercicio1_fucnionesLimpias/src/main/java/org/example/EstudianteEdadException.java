package org.example;

public class EstudianteEdadException extends Exception{

    /**
     * Exception para caso el estudiante tenga edad menor que 16 anos.
     *
     * @param sNombre
     * @param iEdad
     */
    public EstudianteEdadException(String sNombre, int iEdad) {
        super("El estudiante tiene que tener edad major que 16 anos: Datos del estudiante (" + sNombre + " " + iEdad + ")");    }
}
