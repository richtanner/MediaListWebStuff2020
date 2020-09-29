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

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String movie1Title =  "The Last Airbender";
    private static final String movie1Year = "2010";
    private static final String movie1Description = "Avatar, a cartoon set in a pre-modern \"element bending\" world, is completely ruined with this movie. The original is full of comedy, story building, and character devolpment. None of which can be found here. A whole seasons plot can not fit in one movie, especially like this. Avater tried to be amibous and the whole thing seems rushed regardless if you've seen the original or not.";
    private static final String movie1Image = "lastairbenderposter";
    private static final String movie1Weblink = "https://www.rottentomatoes.com/m/last_airbender";

    private static final String movie2Title = "Death Note";
    private static final String movie2Year = "2017";
    private static final String movie2Description = "An extraordinary smart japanese teen named L stumbles upon a deathnote, a book killing anyone's name whose written in it. With killings happening across the world an equally smart japanese private detective Light shows up to find the killer, and stop him. This note also comes with a japanese death god, Ryuk, acting as a neutral character not really caring what happens (he is definitely the best character). So naturally the netflix adaption only takes these most main plot points, ignores the rest of the story, and sets the movie in the most sterotypical American school ever, and ruins the characters. Also L's relationship with his girlfriend is basically a rip off any 13 year old girls Tumblr Twilight fan fiction. They stop dating like four times in the movie just for L to apperntly have written a 15 page essay in the notebook to have the movies ending go his way.";
    private static final String movie2Image = "deathnotetrash";
    private static final String movie2Weblink = "https://www.rottentomatoes.com/m/death_note_2017";

    private static final String movie3Title = "Dragonball Evolution";
    private static final String movie3Year = "2009";
    private static final String movie3Description = "Where does one even begin. The plot is basically do whatever for the first 95% then fight Picallo.   Most adaptions have the deciency to at the very least sort of follow an arc or storyline from the show, and give respect to the characters it shows. This movie is markets itself as \"The legend come to live\", and pays for it. Even as a spin off this movie has terrible acting and story. Goku seems to just fall into things for his success instead of the rigorous training that the anime is known for.";
    private static final String movie3Image = "dbzbad";
    private static final String movie3Weblink = "https://www.rottentomatoes.com/m/dragonball/reviews";

    private static final String movie4Title = "Diary of a Wimpy Kid";
    private static final String movie4Year = "2010";
    private static final String movie4Description = "  This one is just personal. Other than Percy Jackson, Diary of a Wimpy Kid is one of my favorite childhood series. This is a disgrace and has less funny jokes than the Pledge of Alligence. Barely follows any plot. Not very good acting. I don\'t know how they expected to make a comic a movie but having a family run around all day was not it. The cheese touch was live though.";
    private static final String movie4Image = "diaryofawimpy";
    private static final String movie4Weblink = "https://www.rottentomatoes.com/m/diary_of_a_wimpy_kid";

    private static final String movie5Title = "Dumbo";
    private static final String movie5Year = "2019";
    private static final String movie5Description = "Elephant go fly hehe. Takes the cartoon and takes all the magic out of it.";
    private static final String movie5Image = "dumbopic";
    private static final String movie5Weblink = "https://www.rottentomatoes.com/m/dumbo_2019";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        if(!(ITEM_MAP.containsKey("The Last Airbender")))
        {
            MovieModel aBender = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
            MovieModel dNote = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
            MovieModel dBall = new MovieModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
            MovieModel dKid = new MovieModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
            MovieModel dBo = new MovieModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

            addMovieToList(aBender);
            addMovieToList(dNote);
            addMovieToList(dBall);
            addMovieToList(dKid);
            addMovieToList(dBo);
        }
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
