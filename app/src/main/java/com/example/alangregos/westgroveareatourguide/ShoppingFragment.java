package com.example.alangregos.westgroveareatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment  extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<ListEntry> location = new ArrayList<ListEntry>();

        // TODO: 8/5/2018 populate the list with entries

        //location.add("data to be added from constructor")

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

        ListEntryAdapter adapter = new ListEntryAdapter(getActivity(), location, R.color.colorShopping);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ListEntry entry = location.get(position);


            }

        });

        return rootView;

    }

}
