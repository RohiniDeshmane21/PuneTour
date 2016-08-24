package com.example.android.punetourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class treakInfo extends AppCompatActivity {
    Button map,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treak_info);
        setTitle("TREAK");
        map = (Button)findViewById(R.id.btnMap);
        next = (Button)findViewById(R.id.btnNext);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f",18.7102, 73.4759);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(treakInfo.this,
                        smallTrip.class);
                startActivity(myIntent);
            }
        });
    }
}
