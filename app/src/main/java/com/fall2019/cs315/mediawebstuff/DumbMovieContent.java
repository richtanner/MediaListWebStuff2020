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

    private static final String movie1Title = "Iron Man";
    private static final String movie1Description = "This was the first Marvel movie released to kick of the cinematic dynasty that it would become.\n\nIn this action packed movie we are introduced to Tony Stark, who is a genius, billionaire engineer. He is being held captive in an Afghan cave. In efforts to escape and fight evil, he creates a unique weaponized suit of armor, and inserts a disc that provides the suit power and is his life source into his chest.";
    private static final String movie1Year = "2008";
    private static final String movie1Image = "iron_man";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt0371746/";

    private static final String movie2Title = "Avengers: Endgame";
    private static final String movie2Description = "This movie is the finale to Marvel\\'s Avengers series, and boy did it go out with a bang!\n\nAfter the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos\\'s actions and restore balance to the universe.\n\nTo do this they must use time travel through the quantum realm in efforts to collect all of the \"Infinity Stones\" needed to use the \"Infinity Gauntlet,\" which does what whoever is wearing it wishes at the snap of their fingers.";
    private static final String movie2Year = "2019";
    private static final String movie2Image = "avengers_endgame";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt4154796/";

    private static final String movie3Title = "Black Panther";
    private static final String movie3Description = "Marvel takes a different approach to their usual superhero stories in The Black Panther, with much more serious and politically charged theme.\n\nIt follows the story of T\\'Challa, heir to the hidden but technologically advanced kingdom of Wakanda, who must step up to lead his people into a new future and confront a challenger from his country's past";
    private static final String movie3Year = "2018";
    private static final String movie3Image = "black_panther";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt1825683/";

    private static final String movie4Title = "Guardians of the Galaxy";
    private static final String movie4Description = "By far Marvel\\'s most whacky line up of superheroes band together in this film. It is full of intense action and hilarious comedy.\n\nThis movie follows the unification of a group of intergalactic criminals, who must pull together to stop a fanatical warrior with plans to purge the universe.";
    private static final String movie4Year = "2014";
    private static final String movie4Image = "guardians_of_the_galaxy";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt2015381/";

    private static final String movie5Title = "The Ant-Man and The Wasp";
    private static final String movie5Description = "This sequel to Ant-Man (2015) is jam-packed with comedy and Quantum Realm action.\n\nAs Scott Lang balances being both a superhero and a father, Hope van Dyne and Dr. Hank Pym present an urgent new mission that finds The Ant-Man fighting alongside The Wasp to uncover secrets from their pasts.";
    private static final String movie5Year = "2018";
    private static final String movie5Image = "ant_man_and_the_wasp";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt5095030/";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel ironMan = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel endgame = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
        MovieModel blackPanther = new MovieModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
        MovieModel gOfGalaxy = new MovieModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
        MovieModel antWasp = new MovieModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

        // add EACH movie object to our lists and maps
        addMovieToList(ironMan);
        addMovieToList(endgame);
        addMovieToList(blackPanther);
        addMovieToList(gOfGalaxy);
        addMovieToList(antWasp);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
