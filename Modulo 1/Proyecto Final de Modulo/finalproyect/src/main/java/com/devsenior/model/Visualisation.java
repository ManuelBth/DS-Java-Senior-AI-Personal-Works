package com.devsenior.model;

public class Visualisation {

    private User user;
    private Movie movie;
    private int minutes_watched;
    
    public Visualisation(User user, Movie movie, int minutes_watched) {
        this.user = user;
        this.movie = movie;
        this.minutes_watched = minutes_watched;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getMinutes_watched() {
        return minutes_watched;
    }

    public void setMinutes_watched(int minutes_watched) {
        this.minutes_watched = minutes_watched;
    }

    @Override
    public String toString() {
        return "Visualisation [user=" + user + ", movie=" + movie + ", minutes_watched=" + minutes_watched + "]";
    }

}
