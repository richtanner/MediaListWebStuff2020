package com.fall2019.cs315.mediawebstuff;

import android.app.Activity;
import android.graphics.Movie;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;


public class launch extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Bundle extras;
        String newString = "";
        if (savedInstanceState == null) {
            extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString(MovieDetailFragment.ARG_ITEM_ID);
            }
        }

        final WebView thisWebView = findViewById(R.id.webView);
        thisWebView.getSettings().setJavaScriptEnabled(true);
    //delay webview visibility
        if (newString != null) {
            thisWebView.loadUrl(newString);
            final TextView loading = findViewById(R.id.loading);
            new Handler().postDelayed(new Runnable()
            {
                public void run ()
                {
                    showWebView(loading, thisWebView);
                }
            }, 2000);
        }
    }
    private void showWebView(TextView loading, WebView thisWebView)
    {
        loading.setVisibility(View.INVISIBLE);
        thisWebView.setVisibility(View.VISIBLE);
    }
}


