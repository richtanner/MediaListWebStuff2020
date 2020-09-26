package com.fall2019.cs315.mediawebstuff;

import android.content.Intent;
import android.graphics.Picture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        String url = intent.getExtras().getString("weblinkthing");

        //Gets progress bar
        final ProgressBar progress = findViewById(R.id.progressBar);

        WebView web = (WebView) findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(true);

        //Hides Progress Bar after the page loads
        web.setPictureListener(new WebView.PictureListener() {
            public void onNewPicture(WebView webView, Picture picture) {
                progress.setVisibility(View.INVISIBLE);
            }
        });

        web.loadUrl(url);
    }

    public void back(View view) {
        finish();
    }
}