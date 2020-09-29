package com.fall2019.cs315.mediawebstuff;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A fragment representing a single Movie detail screen.
 * This fragment is either contained in a {@link MovieListActivity}
 * in two-pane mode (on tablets) or a {@link MovieDetailActivity}
 * on handsets.
 */
public class MovieDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The Movie content this fragment is presenting.
     */
    private MovieModel mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MovieDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // CS315: DO THIS
        // TODO: BUG FIX - Figure out why the App CRASHES when we rotate this Activity...

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the Movie content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.

            mItem = DumbMovieContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getMovieTitle());
            }
            ImageView thisMovieImageView = activity.findViewById(R.id.movieImageView);
            if (thisMovieImageView != null) {

                // CS315: DO THIS
                // TODO: Set the image based upon the string we got stashed in getMovieImage()
                // switch cases for setting the images based on strings
                switch(mItem.getMovieImage()) {
                    case "Monty Python and the Holy Grail":
                        thisMovieImageView.setImageResource(R.drawable.montypython);
                        break;
                    case "Star Wars: Episode III - Revenge of the Sith":
                        thisMovieImageView.setImageResource(R.drawable.starwars);
                        break;
                    case "Friday":
                        thisMovieImageView.setImageResource(R.drawable.friday);
                        break;
                    case "Star Trek":
                        thisMovieImageView.setImageResource(R.drawable.startrek);
                        break;
                    case "Transformers":
                        thisMovieImageView.setImageResource(R.drawable.transformers);
                        break;
                    default:
                        break;
                }

            }

            FloatingActionButton fab = (FloatingActionButton) activity.findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // CS315: DO THIS
                    // TODO: launch the webpage with the URL we gots back from the model... also lose the snackbar stuff
                    // TODO: hint - you need to establish a new intent and launch a new Activity
                    // TODO: also, make sure you have a ProgressBar on your WebView, so users know you are loading something!

                    Snackbar.make(view, "Make this button launch a NEW Activity with a WebView in it!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.movie_detail, container, false);

        // Show the Movie Description as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.movie_detail)).setText(mItem.getMovieDescription());
        }

        return rootView;
    }
}

