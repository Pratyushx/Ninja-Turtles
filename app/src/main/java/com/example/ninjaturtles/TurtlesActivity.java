package com.example.ninjaturtles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;


public class TurtlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turtles);
    }

    public void radioClick(View view) {
        ImageView img = (ImageView) findViewById(R.id.turtle_image);

        int id = view.getId();
        if (id == R.id.leo_button) {
            img.setImageResource(R.drawable.tmntleo);
        } else if (id == R.id.mike_button) {
            img.setImageResource(R.drawable.tmntmike);
        } else if (id == R.id.don_button) {
            img.setImageResource(R.drawable.tmntdon);
        } else if (id == R.id.raph_button) {
            img.setImageResource(R.drawable.tmntraph);
        }
    }
}


