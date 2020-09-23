package com.fall2019.cs315.mediawebstuff;

import android.support.annotation.StringRes;

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
//Rat Movie
    private static final String movie1Title = "Rat Movie";
    private static final String movie1Description = "In the middle of the night, The Rats and their leader The Giant Rat sing their legendary chant:\n" +
            "\n" +
            "Rats: Rats, we're rats, we're the rats. We prey at night, we stalk at night, we're the rats.\n" +
            "\n" +
            "Giant Rat: I'm da giant rat that makes all of da rules!\n" +
            "\n" +
            "Giant Rat and Rats: Let's see what kind of trouble we can get ourselves into\uFEFF!";
    private static final String movie1Year = "2014";
    private static final String movie1Image = "Rat Movie";
    private static final String movie1Weblink = "https://jerma-lore.fandom.com/wiki/Rat_Movie";

//Dead Poets Society
    private static final String movie2Title = "Dead Poets Society";
    private static final String movie2Description = "A new English teacher, John Keating (Robin Williams), is introduced to an all-boys " +
            "preparatory school that is known for its ancient traditions and high standards. He uses unorthodox methods to reach out to his " +
            "students, who face enormous pressures from their parents and the school. With Keating's help, students Neil Perry (Robert Sean Leonard), " +
            "Todd Anderson (Ethan Hawke) and others learn to break out of their shells, pursue their dreams and seize the day.";
    private static final String movie2Year = "1989";
    private static final String movie2Image = "Dead Poets";
    private static final String movie2Weblink = "https://www.rottentomatoes.com/m/dead_poets_society";





    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel ratMovie = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel deadPoets = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);

        // add EACH movie object to our lists and maps

        addMovieToList(ratMovie);
        addMovieToList(deadPoets);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
