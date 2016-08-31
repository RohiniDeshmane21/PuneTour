package com.example.android.punetourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Rupali on 31-08-2016.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {
    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        final Attraction currentAttraction = getItem(position);
        //check if existing view is being reused, otherwise inflate the new
        View listitemView = convertView;

        if(listitemView == null)

        {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_details_list_view,parent,false);
        }

        TextView attractionName = (TextView) listitemView.findViewById(R.id.nameTextView);
        attractionName.setText(currentAttraction.getAttractionName());

        final TextView attractionInfo = (TextView) listitemView.findViewById(R.id.infotextView);
        attractionInfo.setText(currentAttraction.getAttractionInfo());

        if(currentAttraction.hasImage())
        {
            ImageView attractionImg = (ImageView) listitemView.findViewById(R.id.attractionImageView);
            attractionImg.setBackgroundResource(currentAttraction.getAttractionPhoto());
        }

        Button map = (Button) listitemView.findViewById(R.id.btnMap);

        /*
        Open map on map button click
         */
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", currentAttraction.getLatitude(),currentAttraction.getlongitude());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getContext().startActivity(intent);
            }
        });

        return listitemView;

    }

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions)
    {
        super(context,0,attractions);

    }
}
