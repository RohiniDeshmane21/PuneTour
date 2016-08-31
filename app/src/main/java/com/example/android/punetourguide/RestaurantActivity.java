package com.example.android.punetourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        setTitle(R.string.retaurant);

        ArrayList<Attraction> attraction = new ArrayList<Attraction>();
        attraction.add(new Attraction(R.string.bashoRestaurant,R.string.bashoAddress,R.drawable.basho,73.5138,18.5011));
        attraction.add(new Attraction(R.string.durvankur,R.string.durvankurAddress,R.drawable.durvankur,73.8466,18.5083));

        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attraction);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

    }
}
