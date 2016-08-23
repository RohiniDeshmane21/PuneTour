package com.example.android.punetourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView imgTreak, imgSmallTrip, imgBeaches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgTreak = (TextView)findViewById(R.id.info_treak);
        imgSmallTrip = (TextView)findViewById(R.id.info_smallTrip);
        imgBeaches = (TextView)findViewById(R.id.info_beaches);

        imgTreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        treakInfo.class);
                startActivity(myIntent);
            }
        });

        imgSmallTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        smallTrip.class);
                startActivity(myIntent);
            }
        });

        imgBeaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        beaches.class);
                startActivity(myIntent);
            }
        });
    }
}
