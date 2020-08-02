package com.example.android.guideme;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Activity activity, ArrayList<Location> locations) {
        super(activity, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Location currentLocation = getItem(position);
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentLocation.getImageResourceId());
        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentLocation.getName());
        TextView address = listItemView.findViewById(R.id.address);
        address.setText(currentLocation.getAddress());
        return listItemView;
    }
}
