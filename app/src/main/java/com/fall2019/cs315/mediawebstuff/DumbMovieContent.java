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

//Zathura
    private static final String movie3Title = "Zathura: A Space Adventure";
    private static final String movie3Description = "After their father (Tim Robbins) is called into work, two young boys, Walter (Josh Hutcherson)" +
            " and Danny (Jonah Bobo), are left in the care of their teenage sister, Lisa (Kristen Stewart), and told they must stay inside. Walter" +
            " and Danny, who anticipate a boring day, are shocked when they begin playing Zathura, a space-themed board game, which they realize" +
            " has mystical powers when their house is shot into space. With the help of an astronaut (Dax Shepard), the boys attempt to return home.";
    private static final String movie3Year = "2005";
    private static final String movie3Image = "Zathura";
    private static final String movie3Weblink = "https://www.rottentomatoes.com/m/zathura";

//Inspector Gadget
    private static final String movie4Title = "Inspector Gadget";
    private static final String movie4Description = "John Brown (Matthew Broderick) is a bumbling but well-intentioned security guard who is badly injured " +
            "in an explosion planned by an evil mastermind. He is taken to a laboratory, where Brenda (Joely Fisher), a leading robotics surgeon, replaces " +
            "his damaged limbs with state-of-the-art gadgets and tools. Named Inspector Gadget by the press, John -- along with his niece, Penny " +
            "(Michelle Trachtenberg), and her trusty dog, Brain -- uses his new powers to discover who was behind the explosion.";
    private static final String movie4Year = "1999";
    private static final String movie4Image = "Gadget";
    private static final String movie4Weblink = "https://www.rottentomatoes.com/m/inspector_gadget";

//Inspector Gadget
    private static final String movie5Title = "La La Land";
    private static final String movie5Description = "Sebastian (Ryan Gosling) and Mia (Emma Stone) are drawn together by their common desire " +
            "to do what they love. But as success mounts they are faced with decisions that begin to fray the fragile fabric of their love " +
            "affair, and the dreams they worked so hard to maintain in each other threaten to rip them apart.";
    private static final String movie5Year = "2016";
    private static final String movie5Image = "La La";
    private static final String movie5Weblink = "https://www.rottentomatoes.com/m/la_la_land";


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects


        // add EACH movie object to our lists and maps
        if(!(ITEM_MAP.containsKey("Rat Movie")))
            {
                MovieModel ratMovie = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
                MovieModel deadPoets = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
                MovieModel zathura = new MovieModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
                MovieModel gadget = new MovieModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
                MovieModel la = new MovieModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

                addMovieToList(ratMovie);
                addMovieToList(deadPoets);
                addMovieToList(zathura);
                addMovieToList(gadget);
                addMovieToList(la);
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
