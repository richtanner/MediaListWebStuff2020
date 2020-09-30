package com.fall2019.cs315.mediawebstuff;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebActivity extends AppCompatActivity {
    private WebView web;
    private ProgressBar prog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Bundle extras = getIntent().getExtras();

        String url = extras.getString(MovieDetailFragment.ARG_ITEM_ID);

        web = (WebView) findViewById(R.id.hola);
        prog = (ProgressBar) findViewById(R.id.prg);

        prog.setMax(100);

        web.setWebViewClient(new WebViewClient()
        {
            @Override
            public void onPageStarted(WebView we, String url, Bitmap icon) {
                super.onPageStarted(we, url, icon);
                prog.setVisibility(View.VISIBLE);
                setTitle("Loading...");
            }
            @Override
            public void onPageFinished(WebView we, String url) {
                super.onPageFinished(we, url);
                prog.setVisibility(View.GONE);
                setTitle(we.getTitle());
            }
        });
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(url);
    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack()) {
            web.goBack();
        }   else {
            super.onBackPressed();
        }
    }
}