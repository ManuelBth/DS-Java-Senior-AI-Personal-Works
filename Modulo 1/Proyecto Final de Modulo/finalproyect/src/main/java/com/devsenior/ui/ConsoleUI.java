package com.devsenior.ui;

import java.util.Scanner;

import com.devsenior.service.AnalyticsService;

public class ConsoleUI {

    private AnalyticsService analyticsService;
    private Scanner scanner;

    public ConsoleUI(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int option;
        do {
            System.out.println("\n=== NETFLIX ANALYTICS ===");
            System.out.println("1. Peliculas mas vistas");
            System.out.println("2. Peliculas por genero");
            System.out.println("3. Tiempo total visto por usuario");
            System.out.println("4. Top usuarios");
            System.out.println("5. Promedio duracion por genero");
            System.out.println("--- Funciones Extras ---");
            System.out.println("6. Peliculas mas vistas por usuario");
            System.out.println("7. Generos mas vistos");
            System.out.println("8. Pelicula con mayor tiempo de reproduccion");
            System.out.println("9. Ranking peliculas por minutos vistos");
            System.out.println("10. Usuarios con mas de N minutos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    showPopularMovies();
                    break;
                case 2:
                    showMoviesByGender();
                    break;
                case 3:
                    showTimeViewedByUser();
                    break;
                case 4:
                    showTopUsers();
                    break;
                case 5:
                    showAverageTimeByGender();
                    break;
                case 6:
                    showMostMovieViewedForUser();
                    break;
                case 7:
                    showMostGenderViewed();
                    break;
                case 8:
                    showMostMovieViewed();
                    break;
                case 9:
                    showRankingMostViewedMovie();
                    break;
                case 10:
                    showNMinutesViewedUsers();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (option != 0);
    }

    private void showPopularMovies() {
        var movies = analyticsService.popularMovies();
        System.out.println("\n--- Peliculas mas vistas ---");
        movies.forEach(entry -> {
            System.out.println("Pelicula: " + entry.getKey().getTitle() + " | Vistas: " + entry.getValue());
        });
    }

    private void showMoviesByGender() {
        var moviesByGender = analyticsService.moviesByGender();
        System.out.println("\n--- Peliculas por genero ---");
        moviesByGender.forEach((gender, movies) -> {
            System.out.println("\nGenero: " + gender);
            movies.forEach(movie -> System.out.println("  - " + movie.getTitle() + " (" + movie.getDuration() + " min)"));
        });
    }

    private void showTimeViewedByUser() {
        var timeByUser = analyticsService.timeViewedByUser();
        System.out.println("\n--- Tiempo total visto por usuario ---");
        timeByUser.forEach((user, time) -> {
            System.out.println("Usuario: " + user.getNombre() + " | Tiempo: " + time + " min");
        });
    }

    private void showTopUsers() {
        var topUsers = analyticsService.timeViewedByUserSorted();
        System.out.println("\n--- Top 3 usuarios ---");
        topUsers.forEach(entry -> {
            System.out.println("Usuario: " + entry.getKey().getNombre() + " | Tiempo total: " + entry.getValue() + " min");
        });
    }

    private void showAverageTimeByGender() {
        var averageByGender = analyticsService.averageTimeByGender();
        System.out.println("\n--- Promedio duracion por genero ---");
        averageByGender.forEach((gender, average) -> {
            System.out.println("Genero: " + gender + " | Promedio: " + String.format("%.2f", average) + " min");
        });
    }

    private void showMostMovieViewedForUser() {
        System.out.print("Ingrese el ID del usuario: ");
        int idUser = scanner.nextInt();
        scanner.nextLine();
        
        var movies = analyticsService.mostMovieViewedForUser(idUser);
        System.out.println("\n--- Peliculas mas vistas por usuario (ID: " + idUser + ") ---");
        movies.forEach(entry -> {
            System.out.println("Pelicula: " + entry.getKey().getTitle() + " | Vistas: " + entry.getValue());
        });
    }

    private void showMostGenderViewed() {
        var genders = analyticsService.mostGenderViewed();
        System.out.println("\n--- Generos mas vistos ---");
        genders.forEach(entry -> {
            System.out.println("Genero: " + entry.getKey() + " | Vistas: " + entry.getValue());
        });
    }

    private void showMostMovieViewed() {
        var movie = analyticsService.mostMovieViewed();
        System.out.println("\n--- Pelicula con mayor tiempo de reproduccion ---");
        movie.forEach(entry -> {
            System.out.println("Pelicula: " + entry.getKey().getTitle() + " | Tiempo total: " + entry.getValue() + " min");
        });
    }

    private void showRankingMostViewedMovie() {
        var movies = analyticsService.rankingMostViewedMovie();
        System.out.println("\n--- Ranking peliculas por minutos vistos ---");
        movies.forEach(entry -> {
            System.out.println("Pelicula: " + entry.getKey().getTitle() + " | Minutos: " + entry.getValue());
        });
    }

    private void showNMinutesViewedUsers() {
        System.out.print("Ingrese la cantidad minima de minutos: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        var users = analyticsService.nMinutesViewedUsers(n);
        System.out.println("\n--- Usuarios con mas de " + n + " minutos ---");
        users.forEach(entry -> {
            System.out.println("Usuario: " + entry.getKey().getNombre() + " | Tiempo: " + entry.getValue() + " min");
        });
    }
}
