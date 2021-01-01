package com.example.tvshowlist;

import java.io.Serializable;

public class Tvshows implements Serializable {

    private String name;
    private int episodes;
    private int seasons;
    private double rating;
    private String genre;
    private int duration;
    private String platform;
    private int img;
    private int year;

    public Tvshows(String name, int seasons, double rating, String genre, int duration, String platform, int img, int year) {
        this.name = name;
        this.seasons = seasons;
        this.rating = rating;
        this.genre = genre;
        this.duration = duration;
        this.platform = platform;
        this.img = img;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
