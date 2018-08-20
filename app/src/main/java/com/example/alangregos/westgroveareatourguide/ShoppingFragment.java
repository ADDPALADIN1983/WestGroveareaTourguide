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
                "Oxford, PA 19363",  39.795627, -75.976877, R.drawable.oxford_commons,
                "Shopping center with Wal-Mart, Starbucks, McDonalds and Snap Fitness. "));

        location.add(new ListEntry("Shoppes At Longwood Village", "859 E Baltimore Pike",
                "Kennett Square, PA 19348", 39.863335, -75.683164, R.drawable.shoppes_at_longwood,
                "Shopping center with TJ Maxx, Famous Footwear, Staples, Starbucks, Wendy’s and, GNC. "));

        location.add(new ListEntry("New Garden Town Square", "350 Scarlet Rd",
                "Kennett Square, PA 19348",  39.839948, -75.731611, R.drawable.new_garden_town_square,
                "Shopping center with Giant, Wells Fargo, Pat's Pizza, China One and, Wine and Spirits Shop. "));

        location.add(new ListEntry("Hockessin Crossing Shopping Center", "7465 Lancaster Pike",
                "Hockessin, DE 19707",  39.790238, -75.698800, R.drawable.hockessin_crossing_shopping_center,
                "Small shopping center with Six Paupers Resaurant and Pub, Wells Fargo, Long and Foster Realtors. "));

        location.add(new ListEntry("Concord Mall", "4737 Concord Pike #720",
                "Wilmington, DE 19803", 39.822859, -75.543908, R.drawable.concord_mall,
                "Larger shopping mall with a couple dozen man brand stores, mostly clothes and shoes, as well as a few electronics stores. "));




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
                Bundle bundle = new Bundle();
                bundle.putSerializable("current", entry);
                MoreInfoFragment fragInfo = new MoreInfoFragment();
                fragInfo.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.text_view_container, fragInfo);
                getFragmentManager().beginTransaction().commit();

            }

        });

        return rootView;

    }

}
