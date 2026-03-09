package com.devsenior.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.devsenior.model.Gender;
import com.devsenior.model.Movie;
import com.devsenior.model.User;
import com.devsenior.model.Visualisation;
import com.devsenior.repository.DataRepository;

public class AnalyticsService {

    private DataRepository data;

    public AnalyticsService(DataRepository data){
        this.data = data;
    }

    /* ----------------------------------------------------------------------------------------------------
        BASE FUNCTIONS, IMPLEMENTED FOR THE REQUIREMENTS OF THE EXERCISE
    ---------------------------------------------------------------------------------------------------- */ 

    public List<Map.Entry<Movie, Long>> popularMovies() {
        return data.getVisualisations().stream()
        .collect(Collectors.groupingBy(Visualisation::getMovie, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.<Movie, Long>comparingByValue().reversed())
        .toList();
    }

    public Map<Gender, List<Movie>> moviesByGender(){
        return data.getMovies().stream()
        .collect(Collectors.groupingBy(Movie::getGender));
    }

    public Map<User, Integer> timeViewedByUser (){
        return data.getVisualisations().stream()
        .collect(Collectors.groupingBy(Visualisation::getUser, Collectors.summingInt(Visualisation::getMinutes_watched)));
    }

    public List<Map.Entry<User, Integer>> timeViewedByUserSorted(){
        return timeViewedByUser()
        .entrySet()
        .stream()
        .sorted(Map.Entry.<User, Integer>comparingByValue().reversed())
        .limit(3)
        .toList();
    }

    public Map<Gender, Double> averageTimeByGender(){
        return data.getMovies().stream()
        .collect(Collectors.groupingBy(Movie::getGender, Collectors.averagingInt(Movie::getDuration)));
    }


    /* ----------------------------------------------------------------------------------------------------
        ADITIONAL FUNCTIONS, IMPLEMENTED AS SUGGESTED.
    ---------------------------------------------------------------------------------------------------- */ 

    public List<Map.Entry<Movie, Long>> mostMovieViewedForUser(int id_user){
        return data.getVisualisations().stream()
        .filter(data -> data.getUser().getId() == id_user)
        .collect(Collectors.groupingBy(Visualisation::getMovie, Collectors.counting()))
        .entrySet().stream()
        .sorted(Map.Entry.<Movie, Long>comparingByValue().reversed())
        .toList();
    }

    public List<Map.Entry<Gender, Long>> mostGenderViewed (){
        return data.getVisualisations().stream()
        .collect(Collectors.groupingBy(v -> v.getMovie().getGender(), Collectors.counting()))
        .entrySet().stream()
        .sorted(Map.Entry.<Gender, Long>comparingByValue().reversed())
        .limit(3)
        .toList();
    }

    public List<Map.Entry<Movie, Integer>> mostMovieViewed (){
        return data.getVisualisations().stream()
        .collect(Collectors.groupingBy(Visualisation::getMovie, Collectors.summingInt(Visualisation::getMinutes_watched)))
        .entrySet().stream()
        .sorted(Map.Entry.<Movie, Integer>comparingByValue().reversed())
        .limit(1)
        .toList();
    }

    public List<Map.Entry<User, Integer>> nMinutesViewedUsers(int n){
        return data.getVisualisations().stream()
        .collect(Collectors.groupingBy(Visualisation::getUser, Collectors.summingInt(Visualisation::getMinutes_watched)))
        .entrySet().stream()
        .filter(v -> v.getValue() > n)
        .toList();
    }

    public List<Map.Entry<Movie, Integer>> rankingMostViewedMovie(){
        return data.getVisualisations().stream()
        .collect(Collectors.groupingBy(Visualisation::getMovie, Collectors.summingInt(Visualisation::getMinutes_watched)))
        .entrySet().stream()
        .sorted(Map.Entry.<Movie, Integer>comparingByValue().reversed())
        .toList();
    }

}
