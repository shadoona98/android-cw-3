package com.example.tvshowlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();
        Tvshows t = (Tvshows) b.getSerializable("tvshow");

        ImageView img = findViewById(R.id.imageView4);

        img.setImageResource(t.getImg());

    }
}