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


    private static final String fastTitle = "Fast and Furious Tokyo Drift";
    private static final String fastDescription = "Fast cars, Guns, Explosions... What else do you need?";
    private static final String fastYear = "2006";
    private static final String fastImage = "fast";
    private static final String fastWeblink = "https://www.imdb.com/title/tt0463985/";

    private static final String gameTitle = "Call of Duty: Black Ops, Game";
    private static final String gameDescription = "First-person shooter game developed by Treyarch and published by activision. First released in 2010 on pc and console. You can play online with and against friends, as well as endure an emaculate campaign. Lets not forget possibly the best part... ZOMBIES! ";
    private static final String gameYear = "2010";
    private static final String gameImage = "blackops";
    private static final String gameWeblink = "https://www.callofduty.com/blackops";

    private static final String songTitle = "Bang, Song";
    private static final String songDescription = "Song by AJR";
    private static final String songYear = "2020";
    private static final String songImage = "ajr";
    private static final String songWeblink = "https://www.youtube.com/watch?v=4THFRpw68oQ";

    private static final String youtTitle = "Graham Stephan, YouTuber";
    private static final String youtDescription = "Real estate agent and investor, talking about money advice and investment tactics. ";
    private static final String youtYear = "2016";
    private static final String youtImage = "yout";
    private static final String youtWeblink = "https://www.youtube.com/c/GrahamStephan/featured";

    private static final String appTitle = "FlappyBird, Game";
    private static final String appDescription = "First of a kind mobile game that took the world by storm in 2013. The player controls a bird, trying to avoid incoming obstacles. My inspiration for computer science and app development.";
    private static final String appYear = "2013";
    private static final String appImage = "app";
    private static final String appWeblink = "https://flappybird.io/";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic() {

        // make those movie objects

        MovieModel fast = new MovieModel(fastTitle, fastDescription, fastYear, fastImage, fastWeblink);
        MovieModel game = new MovieModel(gameTitle, gameDescription, gameYear, gameImage, gameWeblink);
        MovieModel song = new MovieModel(songTitle, songDescription, songYear, songImage, songWeblink);
        MovieModel yout = new MovieModel(youtTitle, youtDescription, youtYear, youtImage, youtWeblink);
        MovieModel app = new MovieModel(appTitle, appDescription, appYear, appImage, appWeblink);


        // add EACH movie object to our lists and maps

        addMovieToList(fast);
        addMovieToList(game);
        addMovieToList(song);
        addMovieToList(yout);
        addMovieToList(app);
        // no more movies to add?  Okay... return our list
        return MOVIES;
    }


    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList(MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
