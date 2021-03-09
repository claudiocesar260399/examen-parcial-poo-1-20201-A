package com.oop.exam.service;

import com.oop.exam.model.Movie;

import java.util.Iterator;
import java.util.LinkedList;

public class MovieManager {
    private LinkedList<Movie> movies;

    public MovieManager() {
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie lordOfTheRings1) {
        movies.add(lordOfTheRings1);
    }

    public Movie findMovie(String title) {

        for(Movie movie: movies){
            if(movie.getTitle().equals(title)){
                return movie;
            }
        }

        /*Iterator<Movie> movieIterator = movies.iterator();

        while(movieIterator.hasNext()){
            Movie movie = movieIterator.next();

            if(movie.getTitle().equals(title)){
                return movie;
            }
        }*/

        return null;

        //return movies.stream().filter(movie -> movie.getTitle().equals(title)).findFirst().orElseThrow();
    }
}
