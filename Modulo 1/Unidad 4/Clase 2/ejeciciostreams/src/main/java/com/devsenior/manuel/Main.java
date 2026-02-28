package com.devsenior.manuel;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = Datos.obtenerEstudiantes();

        System.out.println("Estudiantes mayores de 20 años:");
        filtrarEstudiantes(estudiantes);

        System.out.println("\nEstudiantes de Ingeniería de Sistemas con más de 5 publicaciones:");
        mostrarEstudiantesEspecificos(estudiantes);

        System.out.println("\nPromedio de edad de estudiantes interesados en IA:");
        mostrarEstudiantesConIntereses(estudiantes);

        System.out.println("\nEstudiantes interesados en IA, Big Data, Cloud Computing o Ciberseguridad:");
        mostrarEstudiantesConInteresesEspecificos(estudiantes);

        System.out.println("\nEstudiante con más publicaciones:");
        mostrarEstudiantesConMasPublicaciones(estudiantes);
    }

    public static void filtrarEstudiantes(List<Estudiante> estudiantes){
        // Esta función muestra los estudiantes mayores de 20 años.
        List<Estudiante> resultado = estudiantes.stream()
            .filter(estudiante -> estudiante.getEdad() >= 20)
            .collect(Collectors.toList());
        System.out.println("Los estudiantes mayores de 20 años son:");
        resultado.forEach(System.out::println);
    }

    public static void mostrarEstudiantesEspecificos(List<Estudiante> estudiantes){
        // Esta función muestra los estudiantes que son de Ingeniería de Sistemas y que tienen más de 5 publicaciones.
        List<String> resultado = estudiantes.stream()
            .filter(estudiante -> estudiante.getCarrera().equalsIgnoreCase("Ingenieria de Sistemas") && estudiante.getN_Publicaciones() >= 5)
            .map(Estudiante::getNombre)
            .collect(Collectors.toList());

        System.out.println("Los estudiantes de Ingeniería de Sistemas con más de 5 publicaciones son:");
        resultado.forEach(System.out::println);
    }

    public static void mostrarEstudiantesConIntereses(List<Estudiante> estudiantes){
        // Esta función muestra los estudiantes que tienen intereses en Inteligencia Artificial, Big Data, Cloud Computing o Ciberseguridad.
        double resultado = estudiantes.stream()
            .filter(estudiante -> estudiante.getIntereses().contains("IA"))
            .mapToInt(Estudiante::getEdad)
            .average()
            .orElse(0);

        System.out.println("El promedio de edad de los estudiantes interesados en IA es: " + resultado);        
    }

    public static void mostrarEstudiantesConInteresesEspecificos(List<Estudiante> estudiantes){
        // Esta función muestra los estudiantes que tienen intereses en Inteligencia Artificial, Big Data, Cloud Computing o Ciberseguridad.
        List<String> resultado = estudiantes.stream()
            .filter(estudiante -> estudiante.getIntereses().contains("IA") || estudiante.getIntereses().contains("Big Data") || estudiante.getIntereses().contains("Cloud Computing") || estudiante.getIntereses().contains("Ciberseguridad"))
            .map(Estudiante::getNombre)
            .collect(Collectors.toList());

        System.out.println("Los estudiantes interesados en IA, Big Data, Cloud Computing o Ciberseguridad son:");
        resultado.forEach(System.out::println);        
    }

    public static void mostrarEstudiantesConMasPublicaciones(List<Estudiante> estudiantes){

        estudiantes.stream()
            .max((e1, e2) -> Integer.compare(e1.getN_Publicaciones(), e2.getN_Publicaciones()))
            .ifPresent(estudiante -> System.out.println("El estudiante con más publicaciones es: " + estudiante.getNombre() + " con " + estudiante.getN_Publicaciones() + " publicaciones"));
    }
}