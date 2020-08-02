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
public class CollegeFragment extends Fragment {


    public CollegeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.address_list, container, false);
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.college_gita,R.string.college_gita_name,R.string.college_gita_address));
        locations.add(new Location(R.drawable.college_cv,R.string.college_cv_name,R.string.college_cv_address));
        locations.add(new Location(R.drawable.college_kiit,R.string.college_kiit_name,R.string.college_kiit_address));
        locations.add(new Location(R.drawable.college_iter,R.string.college_iter_name,R.string.college_iter_address));
        locations.add(new Location(R.drawable.college_gift,R.string.college_gift_name,R.string.college_gift_address));
        LocationAdapter adapter = new LocationAdapter(getActivity(),locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
