package org.example;

import java.util.ArrayList;

public class Estudiantes {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    /**
     * Funcion para anadir el estudiant
     *
     * @param estudiantes
     * @throws EstudianteEdadException
     */
    public void anadirEstudiante(Estudiante ...estudiantes) throws EstudianteEdadException {
        for(Estudiante estudiante : estudiantes) {
            if (estudiante.iEdad <= 16) {
                throw new EstudianteEdadException(estudiante.sNombre, estudiante.iEdad);
            }

            this.estudiantes.add(estudiante);
        }
    }
}
