package com.fall2019.cs315.mediawebstuff;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;


public class launch extends AppCompatActivity {

    private MovieModel mItem;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        //String url = mItem.getMovieWeblink();

       // WebView thisWebView = findViewById(R.id.webView);
       // thisWebView.loadUrl(url);
    }

}
