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

        final ArrayList<Information> category = new ArrayList<Information>();
        category.add(new Information(R.string.beaches,R.drawable.beaches));
        category.add(new Information(R.string.smallTrip,R.drawable.small_trip));
        category.add(new Information( R.string.treak,R.drawable.treak));
        category.add(new Information( R.string.retaurant,R.drawable.retaurant));

        InformationAdapter itemsAdapter = new InformationAdapter(this, category);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent appInfo = new Intent(MainActivity.this, BeachesActivity.class);
                        startActivity(appInfo);
                        break;
                    case 1:
                        appInfo = new Intent(MainActivity.this, SmallTripActivity.class);
                        startActivity(appInfo);
                        break;
                    case 2:
                        appInfo = new Intent(MainActivity.this, TreakInfoActivity.class);
                        startActivity(appInfo);
                        break;
                    case 3:
                        appInfo = new Intent(MainActivity.this, RestaurantActivity.class);
                        startActivity(appInfo);
                        break;
                }

            }
        });

    }
}
