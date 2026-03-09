package com.devsenior.repository;

import com.devsenior.model.User;
import com.devsenior.model.Movie;
import com.devsenior.model.Visualisation;
import com.devsenior.model.Gender;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Juan"));
        users.add(new User(2, "Maria"));
        users.add(new User(3, "Pedro"));
        users.add(new User(4, "Ana"));
        users.add(new User(5, "Carlos"));
        users.add(new User(6, "Laura"));
        users.add(new User(7, "Miguel"));
        users.add(new User(8, "Sofia"));
        users.add(new User(9, "Javier"));
        users.add(new User(10, "Isabella"));
        users.add(new User(11, "Diego"));
        users.add(new User(12, "Valentina"));
        users.add(new User(13, "Ricardo"));
        users.add(new User(14, "Carmen"));
        users.add(new User(15, "Fernando"));
        return users;
    }

    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(1, "Avengers: Endgame", Gender.ACTION, 181));
        movies.add(new Movie(2, "Titanic", Gender.DRAMA, 195));
        movies.add(new Movie(3, "Scary Movie", Gender.COMEDI, 90));
        movies.add(new Movie(4, "Star Wars: The Force Awakens", Gender.SCIENCE_FICTION, 138));
        movies.add(new Movie(5, "It", Gender.TERROR, 135));
        movies.add(new Movie(6, "The Dark Knight", Gender.ACTION, 152));
        movies.add(new Movie(7, "La La Land", Gender.DRAMA, 128));
        movies.add(new Movie(8, "Superbad", Gender.COMEDI, 113));
        movies.add(new Movie(9, "The Matrix", Gender.SCIENCE_FICTION, 136));
        movies.add(new Movie(10, "A Quiet Place", Gender.TERROR, 90));
        movies.add(new Movie(11, "Fast & Furious 9", Gender.ACTION, 143));
        movies.add(new Movie(12, "The Notebook", Gender.DRAMA, 123));
        movies.add(new Movie(13, "Step Brothers", Gender.COMEDI, 107));
        movies.add(new Movie(14, "Blade Runner 2049", Gender.SCIENCE_FICTION, 164));
        movies.add(new Movie(15, "The Conjuring", Gender.TERROR, 112));
        movies.add(new Movie(16, "Spider-Man: No Way Home", Gender.ACTION, 148));
        movies.add(new Movie(17, "Forrest Gump", Gender.DRAMA, 142));
        movies.add(new Movie(18, "Mean Girls", Gender.COMEDI, 97));
        movies.add(new Movie(19, "Interstellar", Gender.SCIENCE_FICTION, 169));
        movies.add(new Movie(20, "Get Out", Gender.TERROR, 104));
        return movies;
    }

    public List<Visualisation> getVisualisations() {
        List<User> users = getUsers();
        List<Movie> movies = getMovies();
        
        List<Visualisation> visualisations = new ArrayList<Visualisation>();
        visualisations.add(new Visualisation(users.get(0), movies.get(0), 181));
        visualisations.add(new Visualisation(users.get(1), movies.get(1), 195));
        visualisations.add(new Visualisation(users.get(2), movies.get(1), 182));
        visualisations.add(new Visualisation(users.get(2), movies.get(1), 182));
        visualisations.add(new Visualisation(users.get(2), movies.get(2), 90));
        visualisations.add(new Visualisation(users.get(3), movies.get(3), 138));
        visualisations.add(new Visualisation(users.get(4), movies.get(4), 135));
        visualisations.add(new Visualisation(users.get(5), movies.get(5), 152));
        visualisations.add(new Visualisation(users.get(6), movies.get(6), 128));
        visualisations.add(new Visualisation(users.get(7), movies.get(7), 113));
        visualisations.add(new Visualisation(users.get(8), movies.get(8), 136));
        visualisations.add(new Visualisation(users.get(9), movies.get(9), 90));
        visualisations.add(new Visualisation(users.get(10), movies.get(10), 143));
        visualisations.add(new Visualisation(users.get(11), movies.get(11), 123));
        visualisations.add(new Visualisation(users.get(12), movies.get(12), 107));
        visualisations.add(new Visualisation(users.get(13), movies.get(13), 164));
        visualisations.add(new Visualisation(users.get(14), movies.get(14), 112));
        visualisations.add(new Visualisation(users.get(0), movies.get(3), 70));
        visualisations.add(new Visualisation(users.get(1), movies.get(19), 104));
        visualisations.add(new Visualisation(users.get(2), movies.get(9), 45));
        visualisations.add(new Visualisation(users.get(4), movies.get(18), 169));
        visualisations.add(new Visualisation(users.get(6), movies.get(15), 148));
        visualisations.add(new Visualisation(users.get(8), movies.get(1), 100));
        visualisations.add(new Visualisation(users.get(10), movies.get(4), 135));
        visualisations.add(new Visualisation(users.get(12), movies.get(7), 60));
        visualisations.add(new Visualisation(users.get(14), movies.get(11), 80));
        visualisations.add(new Visualisation(users.get(3), movies.get(16), 142));
        visualisations.add(new Visualisation(users.get(5), movies.get(2), 90));
        visualisations.add(new Visualisation(users.get(7), movies.get(17), 97));
        visualisations.add(new Visualisation(users.get(9), movies.get(0), 90));
        visualisations.add(new Visualisation(users.get(11), movies.get(5), 152));
        visualisations.add(new Visualisation(users.get(13), movies.get(8), 136));
        visualisations.add(new Visualisation(users.get(0), movies.get(6), 128));
        visualisations.add(new Visualisation(users.get(1), movies.get(10), 70));
        visualisations.add(new Visualisation(users.get(2), movies.get(12), 123));
        visualisations.add(new Visualisation(users.get(3), movies.get(14), 112));
        visualisations.add(new Visualisation(users.get(4), movies.get(1), 195));
        visualisations.add(new Visualisation(users.get(5), movies.get(3), 138));
        visualisations.add(new Visualisation(users.get(6), movies.get(9), 45));
        visualisations.add(new Visualisation(users.get(7), movies.get(11), 123));
        visualisations.add(new Visualisation(users.get(8), movies.get(13), 107));
        visualisations.add(new Visualisation(users.get(9), movies.get(15), 148));
        visualisations.add(new Visualisation(users.get(10), movies.get(17), 97));
        visualisations.add(new Visualisation(users.get(11), movies.get(19), 104));
        visualisations.add(new Visualisation(users.get(12), movies.get(0), 181));
        visualisations.add(new Visualisation(users.get(13), movies.get(2), 90));
        visualisations.add(new Visualisation(users.get(14), movies.get(4), 135));
        visualisations.add(new Visualisation(users.get(0), movies.get(8), 136));
        visualisations.add(new Visualisation(users.get(1), movies.get(18), 169));
        visualisations.add(new Visualisation(users.get(2), movies.get(16), 142));
        visualisations.add(new Visualisation(users.get(3), movies.get(5), 152));
        visualisations.add(new Visualisation(users.get(4), movies.get(7), 113));
        visualisations.add(new Visualisation(users.get(5), movies.get(19), 104));
        
        return visualisations;
    }

}
