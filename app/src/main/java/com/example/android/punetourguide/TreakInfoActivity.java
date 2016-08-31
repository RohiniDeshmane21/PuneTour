package com.example.android.punetourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TreakInfoActivity extends AppCompatActivity {
    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treak_info);
        setTitle(R.string.smallTrip);

        ArrayList<Attraction> attraction = new ArrayList<Attraction>();
        attraction.add(new Attraction(R.string.tikona,R.string.tikonaInfo,R.drawable.tikona,73.5128,18.6318));
        attraction.add(new Attraction(R.string.lohagad,R.string.lohagadInfo,R.drawable.lohagad,73.4873,18.6943));
        attraction.add(new Attraction(R.string.visapur,R.string.visapurInfo,R.drawable.visapur,79.3282,19.8854));

        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attraction);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

    }
}
