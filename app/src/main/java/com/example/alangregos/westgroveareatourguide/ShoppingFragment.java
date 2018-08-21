package com.example.alangregos.westgroveareatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<ListEntry> location = new ArrayList<ListEntry>();

        //location.add("data to be added from constructor")
        location.add(new ListEntry("Oxford Commons", "300 Commons Dr",
                "Oxford, PA 19363", 39.795627, -75.976877, R.drawable.oxford_commons,
                getString(R.string.oxford_common_description)));

        location.add(new ListEntry("Shoppes At Longwood Village", "859 E Baltimore Pike",
                "Kennett Square, PA 19348", 39.863335, -75.683164, R.drawable.shoppes_at_longwood,
                getString(R.string.longwood_shoppes_description)));

        location.add(new ListEntry("New Garden Town Square", "350 Scarlet Rd",
                "Kennett Square, PA 19348", 39.839948, -75.731611, R.drawable.new_garden_town_square,
                getString(R.string.new_garden_square_description)));

        location.add(new ListEntry("Hockessin Crossing Shopping Center", "7465 Lancaster Pike",
                "Hockessin, DE 19707", 39.790238, -75.698800, R.drawable.hockessin_crossing_shopping_center,
                getString(R.string.hockessin_crossing_description)));

        location.add(new ListEntry("Concord Mall", "4737 Concord Pike #720",
                "Wilmington, DE 19803", 39.822859, -75.543908, R.drawable.concord_mall,
                getString(R.string.concord_mall_description)));


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

        ListEntryAdapter adapter = new ListEntryAdapter(getActivity(), location, R.color.colorShopping);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}
