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

    //
    private static final String movie1Title = "World War Z";
    private static final String movie1Description = "Former United Nations employee Gerry Lane traverses the world in a race against time to stop a zombie pandemic that is toppling armies and governments and threatens to destroy humanity itself.";
    private static final String movie1Year = "2013";
    private static final String movie1Image = "wwz";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt0816711/";

    private static final String movie2Title = "The Replacements";
    private static final String movie2Description = "During a pro football strike, the owners hire substitute players.";
    private static final String movie2Year = "2000";
    private static final String movie2Image = "replacements";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt0191397/";

    private static final String movie3Title = "The Princess Bride";
    private static final String movie3Description = "While home sick in bed, a young boy's grandfather reads him the story of a farmboy-turned-pirate who encounters numerous obstacles, enemies and allies in his quest to be reunited with his true love.";
    private static final String movie3Year = "1987";
    private static final String movie3Image = "princessbride";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt0093779/";

    private static final String movie4Title = "Ready Player One";
    private static final String movie4Description = "When the creator of a virtual reality called the OASIS dies, he makes a posthumous challenge to all OASIS users to find his Easter Egg, which will give the finder his fortune and control of his world.";
    private static final String movie4Year = "2018";
    private static final String movie4Image = "rpone";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt1677720/";

    private static final String movie5Title = "Zombieland: Double Tap";
    private static final String movie5Description = "Columbus, Tallahassee, Wichita, and Little Rock move to the American heartland as they face off against evolved zombies, fellow survivors, and the growing pains of the snarky makeshift family.";
    private static final String movie5Year = "2019";
    private static final String movie5Image = "zombieland";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt1560220/";


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel movie1 = new MovieModel (movie1Title,movie1Description,movie1Year,movie1Image,movie1Weblink);
        MovieModel movie2 = new MovieModel (movie2Title,movie2Description,movie2Year,movie2Image,movie2Weblink);
        MovieModel movie3 = new MovieModel (movie3Title,movie3Description,movie3Year,movie3Image,movie3Weblink);
        MovieModel movie4 = new MovieModel (movie4Title,movie4Description,movie4Year,movie4Image,movie4Weblink);
        MovieModel movie5 = new MovieModel (movie5Title,movie5Description,movie5Year,movie5Image,movie5Weblink);

        // add EACH movie object to our lists and maps
        addMovieToList(movie1);
        addMovieToList(movie2);
        addMovieToList(movie3);
        addMovieToList(movie4);
        addMovieToList(movie5);


        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
