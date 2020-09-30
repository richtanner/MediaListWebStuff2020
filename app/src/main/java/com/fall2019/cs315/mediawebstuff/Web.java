package com.fall2019.cs315.mediawebstuff;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_activity);

        Bundle extras = getIntent().getExtras();

        final WebView web = (WebView) findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());

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
