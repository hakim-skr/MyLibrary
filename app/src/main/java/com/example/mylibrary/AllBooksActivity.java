package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    ArrayList<Book> books =new ArrayList<>();
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        recyclerView = findViewById(R.id.rv);

        books.add(new Book(1,500,"amarita","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1453065317i/28590941._UY960_SS960_.jpg",
                "adaf afsf asfasf  sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff " +
                        " sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff\n" +
                        "=================================================================",
                "sfsffsfsdf sfsffsfsdfsfsffsfsdfsfsffsfsdfsfsffsfsd sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff" +
                " sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff" +
                " sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff" +
                " sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff" +
                " sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff" +
                " sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff sfsffsfsdf sfsffsfsdfsfsffsfsdfsff",
                "amro abdlhamead"));
        books.add(new Book(1,400,"amarita2","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1453065317i/28590941._UY960_SS960_.jpg","adaf afsf asfasf","sfsffsfsdf","amro abdlhamead"));
        books.add(new Book(1,600,"amarita3","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1453065317i/28590941._UY960_SS960_.jpg","adaf afsf asfasf","sfsffsfsdf","amro abdlhamead"));
        books.add(new Book(1,60,"amarita4","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1453065317i/28590941._UY960_SS960_.jpg","adaf afsf asfasf","sfsffsfsdf","amro abdlhamead"));
        books.add(new Book(1,400,"amarita5","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1453065317i/28590941._UY960_SS960_.jpg","adaf afsf asfasf","sfsffsfsdf","amro abdlhamead"));
        books.add(new Book(1,240,"amarita6","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1453065317i/28590941._UY960_SS960_.jpg","adaf afsf asfasf","sfsffsfsdf","amro abdlhamead"));
        books.add(new Book(1,461,"amarita7","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1453065317i/28590941._UY960_SS960_.jpg","adaf afsf asfasf","sfsffsfsdf","amro abdlhamead"));
        books.add(new Book(1,54,"amarita8","https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1453065317i/28590941._UY960_SS960_.jpg","adaf afsf asfasf","sfsffsfsdf","amro abdlhamead"));

        BookRecViewAdapter adapter = new BookRecViewAdapter(books,this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}