package com.example.tvshowlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Tvshows> tvshowLibrary = new ArrayList<>();

        Tvshows a = new Tvshows("Prison Break",5,4.8,"Crime",45,"FOX", R.drawable.prisonbreak,2005);
        Tvshows b = new Tvshows("Pretty Little Liars", 7, 4.5,"Mystery",45, "Freeform",R.drawable.pll,2010);
        Tvshows c = new Tvshows("The Vampire Diaries",8,4.7,"Fantasy",40,"The CW",R.drawable.tvd,2009);
        Tvshows d = new Tvshows("Sherlock",4,4.8,"Mystery",90,"BBC One",R.drawable.sherlock,2010);
        Tvshows e = new Tvshows("Crash Landing on You",1,5,"Romance",70,"Netflix",R.drawable.crashlanding,2019);
        Tvshows f = new Tvshows("Itaewon Class",1,4.9,"Drama",66,"Netflix",R.drawable.itaewonclass,2020);

        tvshowLibrary.add(a);
        tvshowLibrary.add(b);
        tvshowLibrary.add(c);
        tvshowLibrary.add(d);
        tvshowLibrary.add(e);
        tvshowLibrary.add(f);

        RecyclerView r = findViewById(R.id.rv);

        r.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        r.setLayoutManager(lm);


        TvshowAdapter t = new TvshowAdapter(tvshowLibrary, MainActivity.this);
        r.setAdapter(t);



    }
}