package com.example.android.punetourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rupali on 30-08-2016.
 */
public class informationAdapter extends ArrayAdapter<information> {
    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        final information currentCategory = getItem(position);
        //check if existing view is being reused, otherwise inflate the new
        View listitemView = convertView;

        if(listitemView == null)

        {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.options_list_view,parent,false);
        }

        TextView categoryName = (TextView) listitemView.findViewById(R.id.info_text_view);
        categoryName.setText(currentCategory.getCategory());


        if(currentCategory.hasImage())
        {
            categoryName.setBackgroundResource(currentCategory.getImageResource());
            categoryName.setVisibility(View.VISIBLE);
        }
        else
        {
            categoryName.setVisibility(View.GONE);
        }

        return listitemView;
    }

    public  informationAdapter(Activity context, ArrayList<information> numbers)
    {
        super(context,0,numbers);

    }

}
