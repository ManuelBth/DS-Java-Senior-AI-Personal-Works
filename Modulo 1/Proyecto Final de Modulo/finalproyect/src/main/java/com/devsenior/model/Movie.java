package com.devsenior.model;

public class Movie {

    private int id;
    private String title;
    private Gender gender;
    private int duration;
    
    public Movie(int id, String title, Gender gender, int duration) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", gender=" + gender + ", duration=" + duration + "]";
    }

}
