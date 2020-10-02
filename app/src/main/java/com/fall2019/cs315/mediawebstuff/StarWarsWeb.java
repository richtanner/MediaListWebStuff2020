package com.fall2019.cs315.mediawebstuff;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class StarWarsWeb extends AppCompatActivity
{
    public ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starwarsweb_activity);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        Bundle extras = getIntent().getExtras();
        WebView StarWarsWeb = (WebView) findViewById(R.id.starwarsweb);
        StarWarsWeb.getSettings().setJavaScriptEnabled(true);
        StarWarsWeb.setWebViewClient(new WebViewClient()
        {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    progressBar.setVisibility(View.VISIBLE);
                    setTitle("Loading");
                }
                @Override
                public void onPageFinished(WebView view, String url)
                {
                    super.onPageFinished(view, url);
                    progressBar.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                }
            });

        String url = "" ;
        if(savedInstanceState == null)
        {
            if(extras == null)
                url = null;
            else
                url = extras.getString(MovieDetailFragment.ARG_ITEM_ID);
        }
        if (url != null)
        {
            StarWarsWeb.loadUrl(url);
        }
    }
}
