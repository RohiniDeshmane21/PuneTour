package com.example.android.punetourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);

        //int attractionNm, int info,int photo,int lang, int lati
        ArrayList<Attraction> attraction = new ArrayList<Attraction>();
        attraction.add(new Attraction(R.string.diveagar,R.string.diveagarInfo,R.drawable.diveagar,72.9789,18.1920));
        attraction.add(new Attraction(R.string.harihareshwar,R.string.harihareshwarInfo,R.drawable.harihareshwar,73.0258,17.9942));
        attraction.add(new Attraction(R.string.murud,R.string.murudInfo,R.drawable.murud,72.9543,18.3293));

        AttractionAdapter attractionAdapter = new AttractionAdapter(this, attraction);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);
        setTitle(getString(R.string.beaches));
    }
}
