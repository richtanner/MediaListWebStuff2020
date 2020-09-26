package com.fall2019.cs315.mediawebstuff;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebActivity extends AppCompatActivity {

    private ProgressBar pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        String webURL = intent.getStringExtra("WEB_URL");
        WebView webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());

        pro = findViewById(R.id.progressBar);

        webview.setWebViewClient(new WebViewClient(){
            public void onPageStarted(WebView view, String url, Bitmap favicon){
                pro.setVisibility(View.VISIBLE);
            }

            public void onPageFinished(WebView view, String url){
                pro.setVisibility(View.INVISIBLE);
            }
        });

        webview.loadUrl(webURL);


    }
}
