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

    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example.
    // DONE

    private static final String show1Title = "Money Heist";
    private static final String show1Description = "A group of robbers are going to rob 2.400 billion of euros at the Museum of Money in Spain. The Professor is in charge and he will recruit the people that is going to be in the heist."; //Context.getString(R.string.show1Des);
    private static final String show1Year = "2017";
    private static final String show1Image = "moneyheist";
    private static final String show1Weblink = "https://www.imdb.com/title/tt6468322/";

    private static final String show2Title = "Friends";
    private static final String show2Description = "A group of friends go through life together, they try to help each other. Cry, laugh, drama, and adventure all together.";
    private static final String show2Year = "1994-2004";
    private static final String show2Image = "friends";
    private static final String show2Weblink = "https://www.imdb.com/title/tt0108778/";

    private static final String show3Title = "Parks and Rec.";
    private static final String show3Description = "The public officials of the Indiana town pursue to make their city a better place.";
    private static final String show3Year = "2009-2020";
    private static final String show3Image = "parksandrec";
    private static final String show3Weblink = "https://www.imdb.com/title/tt1266020/";

    private static final String show4Title = "Young & Hungry";
    private static final String show4Description = "A young chef was hired by a well known young entrepreneur to be her personal chef, many adventures happen along the way.";
    private static final String show4Year = "2014-2018";
    private static final String show4Image = "youngandhungry";
    private static final String show4Weblink = "https://www.imdb.com/title/tt2084712/";

    private static final String show5Title = "Velvet";
    private static final String show5Description = "Fashion house in Spain in the late 50s, a lot of romance, drama, jealousies, and many plot twists.";
    private static final String show5Year = "2013-2016";
    private static final String show5Image = "velvet";
    private static final String show5Weblink = "https://www.imdb.com/title/tt2955402/";


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        if(MOVIES.size() == 0) //So the list does not repeat each time
        {
            // make those movie objects
            MovieModel showMoneyHeist = new MovieModel(show1Title, show1Description, show1Year, show1Image, show1Weblink);
            MovieModel showFriends = new MovieModel(show2Title, show2Description, show2Year, show2Image, show2Weblink);
            MovieModel showParksRec = new MovieModel(show3Title, show3Description, show3Year, show3Image, show3Weblink);
            MovieModel showYoungHungry = new MovieModel(show4Title, show4Description, show4Year, show4Image, show4Weblink);
            MovieModel showVelvet = new MovieModel(show5Title, show5Description, show5Year, show5Image, show5Weblink);

            // add EACH movie object to our lists and maps
            addMovieToList(showMoneyHeist);
            addMovieToList(showFriends);
            addMovieToList(showParksRec);
            addMovieToList(showYoungHungry);
            addMovieToList(showVelvet);
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
