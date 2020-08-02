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
public class TempleFragment extends Fragment {


    public TempleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.address_list, container, false);
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.temple_jagannath,R.string.temple_jagannath_name,R.string.temple_jagannath_address));
        locations.add(new Location(R.drawable.temple_hanuman,R.string.temple_hanuman_name,R.string.temple_hanuman_address));
        locations.add(new Location(R.drawable.temple_nilkantheshwar,R.string.temple_nilkantheshwar_name,R.string.temple_nilkantheshwar_address));
        locations.add(new Location(R.drawable.temple_laxmi,R.string.temple_laxmi_name,R.string.temple_laxmi_address));
        locations.add(new Location(R.drawable.temple_chandi,R.string.temple_chandi_name,R.string.temple_chandi_address));
        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
