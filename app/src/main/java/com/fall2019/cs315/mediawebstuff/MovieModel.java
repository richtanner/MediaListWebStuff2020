package com.fall2019.cs315.mediawebstuff;

public class MovieModel {
    private String movieTitle;
    private String movieDescription;
    private String movieYear;
    private String movieImage;
    private String movieWeblink;

    // initializer
    public MovieModel(final String movieTitle, final String movieDescription, final String movieYear, final String movieImage, final String movieWeblink) {
        setMovieTitle(movieTitle);
        setMovieDescription(movieDescription);
        setMovieYear(movieYear);
        setMovieImage(movieImage);
        setMovieWeblink(movieWeblink);
    }

    // getters
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public String getMovieWeblink() {
        return movieWeblink;
    }

    // setters
    public void setMovieTitle(final String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public void setMovieDescription(final String movieDescription) { this.movieDescription = movieDescription; }
    public void setMovieYear(final String movieYear) {
        this.movieYear = movieYear;
    }
    public void setMovieImage(final String movieImage) {
        this.movieImage = movieImage;
    }
    public void setMovieWeblink(final String movieWeblink) {
        this.movieWeblink = movieWeblink;
    }
}