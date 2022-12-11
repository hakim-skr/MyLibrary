package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {
    private TextView book_name;
    private TextView book_author;
    private TextView book_pages;
    private TextView book_description,shortDect;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        book_name = findViewById(R.id.book_name);
        book_author = findViewById(R.id.book_author);
        book_pages = findViewById(R.id.book_pages);
        book_description = findViewById(R.id.long_description);
        shortDect = findViewById(R.id.shortDec);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String author = intent.getStringExtra("author");
        int pages = intent.getIntExtra("pages",0);
        String description = intent.getStringExtra("longDec");
        String shortDec = intent.getStringExtra("shortDec");

        book_name.setText(name);
        book_author.setText(author);
        book_pages.setText(String.valueOf(pages));
        book_description.setText(description);
        shortDect.setText(shortDec);

    }
}