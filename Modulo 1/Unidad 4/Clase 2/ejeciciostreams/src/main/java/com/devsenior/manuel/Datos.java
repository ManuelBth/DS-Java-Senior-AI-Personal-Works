package com.devsenior.manuel;

import java.util.Arrays;
import java.util.List;

public class Datos {
    
    /**
     * Retorna los usuarios (estudiantes) que cumplen con los criterios:
     * - Edad entre 19 y 22 años
     * - Carrera de Ingeniería de Sistemas y Software
     * - Mínimo 4 publicaciones
     * - Con intereses en: IA, Big Data, Cloud Computing, Ciberseguridad
     */
    public static List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = Arrays.asList(
                crearEstudianteConIntereses("Juan", 20, "Ingenieria de Sistemas", 5, 
                    "IA", "Cloud Computing"),
                crearEstudianteConIntereses("Maria", 21, "Ingenieria de Software", 6, 
                    "Big Data", "Ciberseguridad", "Cloud Computing"),
                crearEstudianteConIntereses("Pedro", 22, "Ingenieria de Sistemas", 4, 
                    "IA", "Ciberseguridad"),
                crearEstudianteConIntereses("Ana", 19, "Ingenieria de Software", 7, 
                    "Big Data", "Cloud Computing", "IA"),
                crearEstudianteConIntereses("Carlos", 20, "Ingenieria de Sistemas", 5, 
                    "Cloud Computing", "Ciberseguridad", "Big Data"),
                crearEstudianteConIntereses("Diana", 21, "Ingenieria de Software", 8, 
                    "IA", "Big Data", "Ciberseguridad"),
                crearEstudianteConIntereses("Luis", 22, "Ingenieria de Sistemas", 6, 
                    "Cloud Computing", "IA", "Ciberseguridad"),
                crearEstudianteConIntereses("Sofia", 19, "Ingenieria de Software", 4, 
                    "Big Data", "Cloud Computing"),
                crearEstudianteConIntereses("Ricardo", 20, "Ingenieria de Sistemas", 9, 
                    "IA", "Ciberseguridad", "Big Data", "Cloud Computing"),
                crearEstudianteConIntereses("Valentina", 21, "Ingenieria de Software", 5, 
                    "Cloud Computing", "IA"),
                crearEstudianteConIntereses("Miguel", 22, "Ingenieria de Sistemas", 7, 
                    "Big Data", "Ciberseguridad", "Cloud Computing"),
                crearEstudianteConIntereses("Paula", 19, "Ingenieria de Software", 10, 
                    "IA", "Big Data", "Ciberseguridad"),
                crearEstudianteConIntereses("Diego", 20, "Ingenieria de Sistemas", 4, 
                    "Cloud Computing", "Ciberseguridad"),
                crearEstudianteConIntereses("Catalina", 21, "Ingenieria de Software", 6, 
                    "Big Data", "IA", "Cloud Computing"),
                crearEstudianteConIntereses("Gabriel", 22, "Ingenieria de Sistemas", 5, 
                    "Ciberseguridad", "Big Data"),
                crearEstudianteConIntereses("Martina", 19, "Ingenieria de Software", 8, 
                    "Cloud Computing", "IA", "Big Data", "Ciberseguridad")
        );
        
        return estudiantes;
    }
    
    /**
     * Método auxiliar para crear estudiantes con intereses
     */
    private static Estudiante crearEstudianteConIntereses(String nombre, int edad, String carrera, 
                                                          int publicaciones, String... intereses) {
        Estudiante estudiante = new Estudiante(nombre, edad, carrera, publicaciones);
        estudiante.setIntereses(Arrays.asList(intereses));
        return estudiante;
    }
}
