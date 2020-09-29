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
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A fragment representing a single Movie detail screen.
 * This fragment is either contained in a {@link MovieListActivity}
 * in two-pane mode (on tablets) or a {@link MovieDetailActivity}
 * on handsets.
 */
public class MovieDetailFragment extends Fragment
{
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
    public MovieDetailFragment()
    {
    }

    private String suffering = "thisShouldBeEmpty_";
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID))
        {
            // Load the Movie content specified by the fragment

            mItem = DumbMovieContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            final Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null)
                appBarLayout.setTitle(mItem.getMovieTitle());

            ImageView thisMovieImageView = activity.findViewById(R.id.movieImageView);
            if (thisMovieImageView != null)
            {
                switch(mItem.getMovieImage())
                {
                    case "lastairbenderposter":
                        thisMovieImageView.setImageResource(R.drawable.lastairbenderposter);
                        break;

                    case "deathnotetrash":
                        thisMovieImageView.setImageResource(R.drawable.deathnotetrash);
                        break;

                    case "dbzbad":
                        thisMovieImageView.setImageResource(R.drawable.dbzbad);
                        break;

                    case "diaryofawimpy":
                        thisMovieImageView.setImageResource(R.drawable.diaryofawimpy);
                        break;

                    case "dumbopic":
                        thisMovieImageView.setImageResource(R.drawable.dumbopic);
                        break;

                    default:
                        thisMovieImageView.setImageResource(R.drawable.brokenbean);
                        break;
                }
            }


            FloatingActionButton fab = (FloatingActionButton) activity.findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, launch.class);
                    intent.putExtra(MovieDetailFragment.ARG_ITEM_ID, mItem.getMovieWeblink());
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.movie_detail, container, false);

        // Show the Movie Description as text in a TextView.
        if (mItem != null)
            ((TextView) rootView.findViewById(R.id.movie_detail)).setText(mItem.getMovieDescription());

        return rootView;
    }
}