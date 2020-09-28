package com.fall2019.cs315.mediawebstuff;

import android.app.Activity;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;


public class launch extends AppCompatActivity
{

    private MovieModel mItem;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        Bundle extras;
        String newString = "";
        if (savedInstanceState == null)
        {
            extras = getIntent().getExtras();
            if(extras == null)
            {
                newString = null;
            }
            else
            {
                newString= extras.getString(MovieDetailFragment.ARG_ITEM_ID);
            }
        }

            WebView thisWebView = findViewById(R.id.webView);
            if(newString != null)
                thisWebView.loadUrl(newString);
        }
}

