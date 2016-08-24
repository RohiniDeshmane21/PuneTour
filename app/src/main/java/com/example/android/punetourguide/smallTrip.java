package com.example.android.punetourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class smallTrip extends AppCompatActivity {

    Button map,next,previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small_trip);
        setTitle("SMALL TRIP");
        map = (Button)findViewById(R.id.btnMap);
        next = (Button)findViewById(R.id.btnNext);
        previous = (Button)findViewById(R.id.btnPrevious);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f",18.4077, 73.5075);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(smallTrip.this,
                        beaches.class);
                startActivity(myIntent);
            }
        });

        previous.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(smallTrip.this,
                        treakInfo.class);
                startActivity(myIntent);
            }
        }));
    }
}
