package com.example.alangregos.westgroveareatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<ListEntry> location = new ArrayList<ListEntry>();

        //location.add("data to be added from constructor")
        location.add(new ListEntry("West Grove Memorial Park", "140 Rosehill Ave",
                "West Grove, PA 19390", 39.821885, -75.824900, R.drawable.west_grove_memorial_park,
                getString(R.string.wg_memorial_description)));

        location.add(new ListEntry("Goddard Park", "282 PA-841",
                "West Grove, PA 19390", 39.812516, -75.825810, R.drawable.goddard_park,
                getString(R.string.goddard_description)));

        location.add(new ListEntry("New Garden Township Park", "8938 Gap Newport Pike",
                "Landenberg, PA 19350", 39.808446, -75.754971, R.drawable.new_garden_township_park,
                getString(R.string.new_garden_park_description)));

        location.add(new ListEntry("White Clay Creek State Park", "880 New London Rd",
                "Newark, DE 19711", 39.733139, -75.757122, R.drawable.white_clay_creek_state_park,
                getString(R.string.clay_creek_description)));

        location.add(new ListEntry("Penn Township Park", "260 Lewis Rd",
                "West Grove, PA 19390", 39.822227, -75.882318, R.drawable.penn_township_park,
                getString(R.string.penn_township_description)));


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

        ListEntryAdapter adapter = new ListEntryAdapter(getActivity(), location, R.color.colorParks);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}
