package com.example.android.guideme;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.address_list, container, false);
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.museum_openair,R.string.museum_openair_name,R.string.museum_openair_address));
        locations.add(new Location(R.drawable.museum_tribalarts,R.string.museum_tribalarts_name,R.string.museum_tribalarts_address));
        locations.add(new Location(R.drawable.museum_kala,R.string.museum_kala_name,R.string.museum_kala_address));
        locations.add(new Location(R.drawable.museum_state,R.string.museum_state_name,R.string.museum_state_address));
        locations.add(new Location(R.drawable.museum_educational,R.string.museum_educational_name,R.string.museum_educational_address));
        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
