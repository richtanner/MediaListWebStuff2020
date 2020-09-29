package com.fall2019.cs315.mediawebstuff;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_activity);

        Bundle extras = getIntent().getExtras();

        WebView web = (WebView)findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);

        String URL = extras.getString(MovieDetailFragment.ARG_ITEM_ID);

    }



}
