package com.example.android.punetourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class beaches extends AppCompatActivity {
    Button map,previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);

        setTitle(getString(R.string.beaches));
        map = (Button)findViewById(R.id.btnMap);
        previous = (Button)findViewById(R.id.btnPrevious);

        /*
        Open map on map button click
         */
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f",18.1920, 72.9789);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(beaches.this,
                        smallTrip.class);
                startActivity(myIntent);
            }
        });
    }
}
