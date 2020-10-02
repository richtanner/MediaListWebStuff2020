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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A fragment representing a single Movie detail screen.
 * This fragment is either contained in a {@link MovieListActivity}
 * in two-pane mode (on tablets) or a {@link MovieDetailActivity}
 * on handsets.
 */
public class MovieDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    private MovieModel mItem;

    public MovieDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // CS315: DO THIS
        // TODO: BUG FIX - Figure out why the App CRASHES when we rotate this Activity...

        if (getArguments().containsKey(ARG_ITEM_ID)) {

            mItem = DumbMovieContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getMovieTitle());
            }
            ImageView thisMovieImageView = activity.findViewById(R.id.movieImageView);
            if (thisMovieImageView != null) {

                switch (mItem.getMovieTitle())
                {
                    case "Star Wars: Episode V" :
                        thisMovieImageView.setImageResource(R.drawable.episodefive);
                        break;
                    case "Star Wars: Episode VI" :
                        thisMovieImageView.setImageResource(R.drawable.episodesix);
                        break;
                    case "Star Wars: Episode III" :
                        thisMovieImageView.setImageResource(R.drawable.episodethree);
                        break;
                    case "Star Wars: Episode IV" :
                        thisMovieImageView.setImageResource(R.drawable.episodefour);
                        break;
                    case "Rogue One: A Star Wars Story" :
                        thisMovieImageView.setImageResource(R.drawable.rogueone);
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
                    Intent intent = new Intent(context, StarWarsWeb.class);
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

