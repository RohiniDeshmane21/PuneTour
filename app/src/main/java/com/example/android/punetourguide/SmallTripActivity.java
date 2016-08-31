package com.example.android.punetourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SmallTripActivity extends AppCompatActivity {

    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small_trip);
        setTitle(R.string.smallTrip);
        //int attractionNm, int info,int photo,int lang, int lati
        ArrayList<Attraction> attraction = new ArrayList<Attraction>();
        attraction.add(new Attraction(R.string.lavasa,R.string.lavasaInfo,R.drawable.lavasa,73.5049,18.4025));
        attraction.add(new Attraction(R.string.lonavla,R.string.lohagadInfo,R.drawable.lonavla,73.4072,18.7481));
        attraction.add(new Attraction(R.string.pavna,R.string.pavnaInfo,R.drawable.pawna,73.4858,18.6668));

        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attraction);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

    }
}
