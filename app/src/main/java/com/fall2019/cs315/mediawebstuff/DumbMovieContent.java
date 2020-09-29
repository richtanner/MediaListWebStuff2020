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

    // My LIST OF MOVIES
    private static final String movieOneTitle = "Monty Python and the Holy Grail";
    private static final String movieOneDescription = "Shows the journey of Monty Python's journey to retrieve the holy grail";
    private static final String movieOneYear = "1975";
    private static final String movieOneImage = "montypython";
    private static final String movieOneWeblink = "https://www.imdb.com/title/tt0071853/";

    private static final String movieTwoTitle = "Star Wars:Episode III - Revenge of the Sith";
    private static final String movieTwoDescription = "Three years into the Clone Wars, the Jedi rescue Palpatine from Count Dooku. As Obi-Wan pursues a new threat, Anakin acts as a double agent between the Jedi Council and Palpatine and is lured into a sinister plan to rule the galaxy.";
    private static final String movieTwoYear = "2005";
    private static final String movieTwoImage = "starwars";
    private static final String movieTwoWeblink = "https://www.rottentomatoes.com/m/star_wars_episode_iii_revenge_of_the_sith";

    private static final String movieThreeTitle = "Friday";
    private static final String movieThreeDescription = "Follows the story of a recently enemployed son, Craig and his best friend Smokey as they sit on their porch. It turns out Smokey is a drug dealer and has used his own supply instead of selling it. Big Worm the man who gave Smokey the drugs then threatens to kill him if he doesn't give him his money by the end of the day. Craig and Smokey eventually find a way to pay him back through a funny series of events.";
    private static final String movieThreeYear = "1995";
    private static final String movieThreeImage = "friday";
    private static final String movieThreeWeblink = "https://www.imdb.com/title/tt0113118/";

    private static final String movieFourTitle = "Star Trek";
    private static final String movieFourDescription = "Aboard the USS Enterprise, the most-sophisticated starship ever built, a novice crew embarks on its maiden voyage. Their path takes them on a collision course with Nero (Eric Bana), a Romulan commander whose mission of vengeance threatens all mankind. If humanity would survive, a rebellious young officer named James T. Kirk (Chris Pine) and a coolly logical Vulcan named Spock (Zachary Quinto) must move beyond their rivalry and find a way to defeat Nero before it is too late.";
    private static final String movieFourYear = "2009";
    private static final String movieFourImage = "startrek";
    private static final String movieFourWeblink = "https://www.rottentomatoes.com/m/star_trek_11";

    private static final String movieFiveTitle = "Transformers";
    private static final String movieFiveDescription = "A man gets a new car which turns out to be an alien mechanical warmachine also known as an autobot. With the arrival of the autobots onto planet Earth, the decepticons rage war against the autobots.";
    private static final String movieFiveYear = "2007";
    private static final String movieFiveImage = "transformers";
    private static final String movieFiveWeblink = "https://www.imdb.com/title/tt0418279/";


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // If statement which checks to see if
        if(!(ITEM_MAP.containsKey("Monty Python and the Holy Grail"))) {
            MovieModel MontyPython = new MovieModel(movieOneTitle, movieOneDescription, movieOneYear, movieOneImage, movieOneWeblink);
            MovieModel StarWarsRevengeOfTheSith = new MovieModel(movieTwoTitle, movieTwoDescription, movieTwoYear, movieTwoImage, movieTwoWeblink);
            MovieModel FridayFirst = new MovieModel(movieThreeTitle, movieThreeDescription, movieThreeYear, movieThreeImage, movieThreeWeblink);
            MovieModel StarTrekRemastered = new MovieModel(movieFourTitle, movieFourDescription, movieFourYear, movieFourImage, movieFourWeblink);
            MovieModel TransformersOriginal = new MovieModel(movieFiveTitle, movieFiveDescription, movieFiveYear, movieFiveImage, movieFiveWeblink);

            addMovieToList(MontyPython);
            addMovieToList(StarWarsRevengeOfTheSith);
            addMovieToList(FridayFirst);
            addMovieToList(StarTrekRemastered);
            addMovieToList(TransformersOriginal);
        }

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
