package com.example.android.guideme;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionFragment extends Fragment {


    public AttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.address_list, container, false);
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.attraction_udaygiri,R.string.attraction_udaygiri_name,R.string.attraction_udaygiri_address));
        locations.add(new Location(R.drawable.attraction_mahanadi,R.string.attraction_mahanadi_name,R.string.attraction_mahanadi_address));
        locations.add(new Location(R.drawable.attraction_deras,R.string.attraction_deras_name,R.string.attraction_deras_address));
        locations.add(new Location(R.drawable.attraction_biju,R.string.attraction_biju_name,R.string.attraction_biju_address));
        locations.add(new Location(R.drawable.attraction_ekamra,R.string.attraction_ekamra_name,R.string.attraction_ekamra_address));
        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
