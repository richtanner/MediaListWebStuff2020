package com.fall2019.cs315.mediawebstuff;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

    public static String URL;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

                // switch cases for setting the images based on strings
                switch(mItem.getMovieTitle()) {
                    case "Monty Python and the Holy Grail":
                        thisMovieImageView.setImageResource(R.drawable.montypython);
                        break;
                    case "Star Wars:Episode III - Revenge of the Sith":
                        thisMovieImageView.setImageResource(R.drawable.starwarsthree);
                        break;
                    case "Friday":
                        thisMovieImageView.setImageResource(R.drawable.friday);
                        break;
                    case "Star Trek":
                        thisMovieImageView.setImageResource(R.drawable.startrekremastered);
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
                    Context context = view.getContext();
                    Intent intent = new Intent(context, Web.class);
                    intent.putExtra(MovieDetailFragment.ARG_ITEM_ID, mItem.getMovieWeblink());
                    startActivity(intent);
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

