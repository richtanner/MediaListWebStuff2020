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

    private static final String movie1Title = "Star Wars: Episode V";
    private static final String movie1Description = "It is a tough time for both the Rebellion and the Empire. The Empire lost The Death Star, while the Rebellion lost their home base. On top of all that, Luke feels lost on what to do, now that his original Master, Obi Wan 'Ben' Kenobi, is no longer with him. Forced to hide from the provoked Empire, the Rebellion settles on the remote planet of Hoth. But Luke has a vision from Ben Kenobi: He is to find his old master Master Yoda from the Clone Wars and be taught by him so he can still become a Jedi. Will he be trained strong enough to bring peace to the galaxy? Or will an unexpected twist throw everything out of balance?";
    private static final String movie1Year = "1980";
    private static final String movie1Image = "episodefive";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt0080684/";

    private static final String actionTitle = "Star Wars: Episode VI";
    private static final String actionDescription = "All cards are on the table. Luke knows that Vader is his father, Han Solo is in need of rescue, and the Empire has just revealed it's newest threat: The Second Death Star. With the rebellion pushing to push the Empire out of the galaxy once and for all, they prepare one final, full frontal assault on The Emperor's battle station. All the while Luke, who understands the severity of the situation, prepares to confront his father in one final attempt to cure his father's (and subsequently the Emperor's) evil from the galaxy, once and for all. ";
    private static final String actionYear = "1983";
    private static final String actionImage = "Sci-Fi Action Movie";
    private static final String actionWeblink = "https://www.imdb.com/title/tt0086190/";

    private static final String movie2Title = "Star Wars: Episode III";
    private static final String movie2Description = "The war has escalated. The Clone Wars rage on, with the Republic and the Separatists both trying to end it. Anakin and Obi Wan's relationship has also escalated: Anakin's pull towards the darkside has never been stronger. After hearing life changing news that his secret wife, Padme Amidala, was pregnant, Anakin begins to have visions that she will die when she gives birth. Determined to not let that happen, Anakin begins to turn to the one person he feels that can help him: Chancellor Palpatine. Little does Anakin, as well as all the Jedi know, that a large and evil sinister plot is about to be revealed, which will change the galaxy forever.";
    private static final String movie2Year = "2005";
    private static final String movie2Image = "Sci-Fi-action";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt0121766/";

    private static final String movie3Title = "Star Wars: Episode IV";
    private static final String movie3Description = "The movie that started it all! Luke, an average farmboy on the desert planet Tatooine, aspires to be more than what his uncle thinks he can be. After a near death experience, Luke crosses paths with Ben Kenobi, a Jedi from a bygone era of the galaxy. After the Empire attacks his home, Luke agrees to be trained by Ben Kenobi to help put a stop to the Empire's evil doings. Excited, cocky, and ready for adventure, Luke sets out with Kenobi to begin his journey. But little does he know, that his world is about to get a whole lot bigger.";
    private static final String movie3Year = "1977";
    private static final String movie3Image = "Sci-Fi-action";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt0076759/";

    private static final String movie4Title = "Rogue One: A Star Wars Story";
    private static final String movie4Description = "The Rebellion has just uncovered a terrible truth: The Empire is building a massive superweapon that can chaos on galactic scales. Time is of the essence, and Jyn Erso, a partisan against the Empire, has just found out that her father was majorly involved in the superweapon's construction. Determined to discover the truth, Jyn sets out on a dangerous mission to uncover buried secrets, and help the rebellion gather information on the new threat that has arisen in the galaxy. ";
    private static final String movie4Year = "2016";
    private static final String movie4Image = "rogueone";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt3748528/";




    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        if (!(ITEM_MAP.containsKey("Star Wars: Episode V")))
        {
            MovieModel episodev = new MovieModel(actionTitle, actionDescription, actionYear, actionImage, actionWeblink);
            MovieModel episodevi = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
            MovieModel episodeiii = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
            MovieModel episodeiv = new MovieModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
            MovieModel episodehalf = new MovieModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);

            addMovieToList(episodev);
            addMovieToList(episodevi);
            addMovieToList(episodeiii);
            addMovieToList(episodeiv);
            addMovieToList(episodehalf);
        }


        // add EACH movie object to our lists and maps
        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
