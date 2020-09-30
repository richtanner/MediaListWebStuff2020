package com.fall2019.cs315.mediawebstuff;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

public class fragmentone extends AppCompatActivity {

    public ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_one);

        progressBar = (ProgressBar)findViewById(R.id.pro);

        Bundle extras = getIntent().getExtras();

        final WebView web = (WebView) findViewById(R.id.webv);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
                setTitle(". . . Loading . . .");
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
                setTitle(view.getTitle());
            }
        });

        String URL = "";

        if(savedInstanceState == null) {
            if(extras == null)
                URL = null;
            else
                URL = extras.getString(MovieDetailFragment.ARG_ITEM_ID);
        }

        if (URL != null) {
            web.loadUrl(URL);

            final TextView loading = findViewById(R.id.loading);

            showWeb(loading, web);
        }
    }

    private void showWeb(TextView loading, WebView web) {
        loading.setVisibility(View.INVISIBLE);
        web.setVisibility(View.VISIBLE);
    }
}