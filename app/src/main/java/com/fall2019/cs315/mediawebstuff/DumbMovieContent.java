package com.fall2019.cs315.mediawebstuff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DumbMovieContent {

    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MovieModel> ITEM_MAP = new HashMap<String, MovieModel>();

    /**
     * A List of the Movie items.
     */
    public static final List<MovieModel> MOVIES = new ArrayList<MovieModel>();


    /**
     * Create all those movie Strings we will be needing for teh models
     */

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String movie1Title = "Tenet";
    private static final String movie1Description = "Latest Movie About Inversion";
    private static final String movie1Year = "2020";
    private static final String movie1Image = "tenet";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt6723592/";

    private static final String movie2Title = "Dunkirk";
    private static final String movie2Description = "World War movie on the horrors of war and the retrieval of troops";
    private static final String movie2Year = "2017";
    private static final String movie2Image = "dunkirk";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt5013056/";

    private static final String movie3Title = "Interstellar";
    private static final String movie3Description = "Movie about the travel to space to save the planet";
    private static final String movie3Year = "2014";
    private static final String movie3Image = "interstellar";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt0816692/";

    private static final String movie4Title = "Inception";
    private static final String movie4Description = "Going into the mind";
    private static final String movie4Year = "2010";
    private static final String movie4Image = "tenet";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt1375666/";

    private static final String movie5Title = "the Prestige";
    private static final String movie5Description = "Two magicians hate each other";
    private static final String movie5Year = "2006";
    private static final String movie5Image = "tenet";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt0482571/";




    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel mov1 = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel mov2 = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
        MovieModel mov3 = new MovieModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
        MovieModel mov4 = new MovieModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
        MovieModel mov5 = new MovieModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

        // add EACH movie object to our lists and maps
        addMovieToList(mov1);
        addMovieToList(mov2);
        addMovieToList(mov3);
        addMovieToList(mov4);
        addMovieToList(mov5);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
