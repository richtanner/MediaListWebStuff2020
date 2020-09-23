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

    private static final String movie1Title = "The Rat Movie";
    private static final String movie1Description = "In the middle of the night, The Rats and their leader The Giant Rat sing their legendary chant:\n" +
            "\n" +
            "Rats: Rats, we're rats, we're the rats. We prey at night, we stalk at night, we're the rats.\n" +
            "\n" +
            "Giant Rat: I'm da giant rat that makes all of da rules!\n" +
            "\n" +
            "Giant Rat and Rats: Let's see what kind of trouble we can get ourselves into\uFEFF!";
    private static final String movie1Year = "2014";
    private static final String movie1Image = "thriller";
    private static final String movie1Weblink = "https://jerma-lore.fandom.com/wiki/Rat_Movie";

    private static final String actionTitle = "Every Action Movie Ever";
    private static final String actionDescription = "The villain has left the hero for dead, or killed the hero’s brother, sister, parents, wife or family pets. Filled with righteous fury, the hero tools up and embarks on a bloody rampage.  \n \nIf the movie does well, we will do it again in the sequel! \n \nMaybe the villain tries to get revenge on the hero for getting revenge on the villain in this movie...";
    private static final String actionYear = "2017";
    private static final String actionImage = "genericaction";
    private static final String actionWeblink = "http://www.denofgeek.com/us/movies/18824/the-5-most-common-action-movie-plots";


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel action = new MovieModel(actionTitle, actionDescription, actionYear, actionImage, actionWeblink);
        MovieModel romcom = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);

        // add EACH movie object to our lists and maps
        addMovieToList(action);
        addMovieToList(romcom);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
