package com.fall2019.cs315.mediawebstuff;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // as soon as THIS Activity loads, we know the APP has loaded, so
        // call for our Main Activity (MovieListActivity, in this case) to load up
        //hola
        Intent intent = new Intent(this, MovieListActivity.class);
        startActivity(intent);
        finish();
    }
}
