package com.example.android.punetourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView imgTreak, imgSmallTrip, imgBeaches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<information> category = new ArrayList<information>();
        category.add(new information("Beaches",R.drawable.beaches));
        category.add(new information("Small Trip",R.drawable.small_trip));
        category.add(new information("Treak",R.drawable.treak));

        informationAdapter itemsAdapter = new informationAdapter(this, category);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            /*//listview clicked item index
            int itemPosition = position;

            //Listview clicked item value
            String itemValue = (String)listView.getItemAtPosition(position);

            //show alert
            Toast.makeText(getApplicationContext(),
                    "Position:"+itemPosition+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();*/
                switch (position) {
                    case 0:
                        Intent appInfo = new Intent(MainActivity.this, beaches.class);
                        startActivity(appInfo);
                        break;
                    case 1:
                        appInfo = new Intent(MainActivity.this, smallTrip.class);
                        startActivity(appInfo);
                        break;
                    case 2:
                        appInfo = new Intent(MainActivity.this, treakInfo.class);
                        startActivity(appInfo);
                        break;
                }

            }
        });
       /* imgTreak = (TextView)findViewById(R.id.info_treak);
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
        });*/
    }
}
