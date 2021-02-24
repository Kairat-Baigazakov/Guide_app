package com.example.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<Data> {

    public DataAdapter(Context context, ArrayList<Data> arrayAdapter) {
        super(context, 0, arrayAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Data data = getItem(position);

        TextView textView_name = listView.findViewById(R.id.name_text);
        textView_name.setText(data.getPlaceName());

        ImageView imageView = listView.findViewById(R.id.image);
        imageView.setImageResource(data.getPlaceImageId());

        TextView infoText = listView.findViewById(R.id.info_text);
        infoText.setText(data.getPlacedetails());

        View nameView = (View) listView.findViewById(R.id.first_layout);
        View info = (View) listView.findViewById(R.id.second_layout);
        info.setVisibility(View.GONE);
        final View listItemView = listView;
        nameView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View info = (View) listItemView.findViewById(R.id.second_layout);
                if (info.getVisibility() == View.VISIBLE) {
                    info.setVisibility(View.GONE);
                } else if (info.getVisibility() == View.GONE) {
                    info.setVisibility(View.VISIBLE);
                }
            }
        });

        TextView address = (TextView) listView.findViewById(R.id.address);
        address.setText(data.getAddress());
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = data.getCoordinate();
                Intent seeOnMap = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" + location + "?18"));
                getContext().startActivity(seeOnMap);
            }
        });


        TextView phoneNumber = (TextView) listView.findViewById(R.id.phone_number);
        phoneNumber.setText(data.getNumber());
            phoneNumber.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String phoneNumber = data.getNumber();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                    getContext().startActivity(callIntent);
                }
            });

        return listView;
    }
}