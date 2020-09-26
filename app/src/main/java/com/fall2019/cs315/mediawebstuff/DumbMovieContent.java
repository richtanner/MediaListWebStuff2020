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

    private static final String movie1Title = "The Batman";
    private static final String movie1Description = "Yet another Batman remake featuring depressed vampire man and riddle man who doesn't dress like riddle man. This movie has like 1/3 of all Batman villians so it has to be good, right?";
    private static final String movie1Year = "2021";
    private static final String movie1Image = "thebatman";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt1877830/";

    private static final String movie2Title = "The Ballad of Buster Scruggs";
    private static final String movie2Description = "Six tales of life and violence in the Old West, following a singing gunslinger, a bank robber, a traveling impresario, an elderly prospector, a wagon train, and a perverse pair of bounty hunters.";
    private static final String movie2Year = "2018";
    private static final String movie2Image = "ballad";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt6412452/";

    private static final String movie3Title = "The Room";
    private static final String movie3Description = "In this movie rated as one of the worst of all time, Johnny is a successful bank executive who lives quietly in a San Francisco townhouse with his fiancée, Lisa. One day, putting aside any scruple, she seduces Johnny's best friend, Mark. From there, nothing will be the same again.";
    private static final String movie3Year = "2003";
    private static final String movie3Image = "room";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt0368226/";

    private static final String movie4Title = "The Devil All The Time";
    private static final String movie4Description = "Movie about a corrupt Western society even though they are up in Ohio, starring quirky spiderman kid and depressed vampire with really bad country accents. Will their love for God keep them from doing bad things? Probably not. People are weird.";
    private static final String movie4Year = "2020";
    private static final String movie4Image = "devil";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt7395114/";

    private static final String movie5Title = "The Umbrella Academy";
    private static final String movie5Description = "No this show isn't about a school for umbrella making, it is super hero school for some of the 43 kids all born on the same day (even though their mothers were not pregnant the day before. Weird.) They have to stop an apocalypse each season it seems, but will their petty emotions keep them from banding together?";
    private static final String movie5Year = "2019 - Present";
    private static final String movie5Image = "umbrella";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt1312171/";
    


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel movie1 = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel movie2 = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
        MovieModel movie3 = new MovieModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
        MovieModel movie4 = new MovieModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
        MovieModel movie5 = new MovieModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

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
