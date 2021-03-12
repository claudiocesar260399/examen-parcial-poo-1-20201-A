package com.oop.exam.model;

public class Movie {
    private String title;
    private int year;
    private String Actors;
    private String Platforms;

    public String getPlatforms() {
        return Platforms;
    }

    public void setPlatforms(String platforms) {
        Platforms = platforms;
    }

    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String synopsis) {
        Synopsis = synopsis;
    }

    private String Synopsis;
    private String director;

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
