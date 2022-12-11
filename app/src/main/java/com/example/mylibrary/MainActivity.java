package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    private Button seeAll, currentlyReading, alreadyReaded, wishList, favorites, about;
    private TextView libraryName, license;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiViews();
        seeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                startActivity(intent);
            }
        });

    }

    private void intiViews() {
        image = findViewById(R.id.imageView);
        seeAll = findViewById(R.id.seeAllBooks);
        currentlyReading = findViewById(R.id.currentlyReading);
        alreadyReaded = findViewById(R.id.alreadyReaded);
        wishList = findViewById(R.id.wishlist);
        favorites = findViewById(R.id.favorites);
        about = findViewById(R.id.about);
        libraryName = findViewById(R.id.libraryName);
        license = findViewById(R.id.license);
    }
}