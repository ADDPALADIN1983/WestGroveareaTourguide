package com.example.alangregos.westgroveareatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DiningFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<ListEntry> location = new ArrayList<ListEntry>();

        //location.add("data to be added from constructor")
        location.add(new ListEntry("Sake Hana", "801 Gap Newport Pike",
                "Avondale, PA 19311", " sakehanapa.com", "(610) 268-2889",
                39.835037, -75.797537, R.drawable.sake_hana,
                getString(R.string.sake_hana_description)));

        location.add(new ListEntry("Perkins Restaurant and Bakery", "954 Gap Newport Pike",
                "Avondale, PA 19311", "stores.perkinsrestaurants.com", "(610) 268-3513",
                39.836616, -75.796732, R.drawable.perkins_restaurant,
                getString(R.string.perkins_description)));

        location.add(new ListEntry("Pizzeria Dei Sapori", "300 E Baltimore Pike",
                "West Grove, PA 19390", "(610) 869-2221",
                39.826092, -75.821879, R.drawable.pizzeria_dei_sapori,
                getString(R.string.sapori_description)));

        location.add(new ListEntry("China Kitchen", "119 Rosehill Ave",
                "West Grove, PA 19390", "eatchinakitchen.com", "(610) 869-2211",
                39.822091, -75.825832, R.drawable.china_kitchen,
                getString(R.string.china_kitchen_descripton)));

        location.add(new ListEntry("West Grove Diner", "108 Rosehill Ave",
                "West Grove, PA 19390", "westgrovediner.weebly.com", "(610) 869-3981",
                39.821877, -75.826417, R.drawable.west_grove_diner,
                getString(R.string.west_grove_diner_description)));

        location.add(new ListEntry("Marrone Delicatessen", "101 Prospect Ave",
                "West Grove, PA 19390", "marronesdeli.com", "(610) 869-8616",
                39.821515, -75.826830, R.drawable.marrone_delicatessen,
                getString(R.string.marrone_description)));

        location.add(new ListEntry("Twelves Grill & Cafe", "10 Exchange Pl",
                "West Grove, PA 19390", "twelvesgrill.com", "(610) 869-4020",
                39.822692, -75.826209, R.drawable.twelves_grill_and_cafe,
                getString(R.string.twelves_description)));

        location.add(new ListEntry("Brothers Pizza & Restaurant", "7 Exchange Pl",
                "West Grove, PA 19390", "brotherspizzaofwestgrove.com", "(610) 869-9070",
                39.822906, -75.826209, R.drawable.brothers_pizza,
                getString(R.string.brothers_descrpition)));

        location.add(new ListEntry("Two Stones Pub Jennersville", "49 Jenners Village",
                "West Grove, PA 19390", "twostonespub.com", "(610) 345-5689",
                39.822590, -75.875214, R.drawable.two_stones_pub,
                getString(R.string.two_stones_description)));

        location.add(new ListEntry("Sakura Hibachi & Sushi", "829 W Baltimore Pike",
                "West Grove, PA 19390", "sakurahibachisushipa.com", "(610) 869-5588",
                39.822747, -75.872740, R.drawable.sakura_hibachi_and_sushi,
                getString(R.string.sakura_description)));


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

        ListEntryAdapter adapter = new ListEntryAdapter(getActivity(), location, R.color.colorDining);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }
}