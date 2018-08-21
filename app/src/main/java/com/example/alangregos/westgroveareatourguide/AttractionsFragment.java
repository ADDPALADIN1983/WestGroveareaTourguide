package com.example.alangregos.westgroveareatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

import static android.content.Intent.ACTION_VIEW;

public class AttractionsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<ListEntry> location = new ArrayList<ListEntry>();

        //location.add("data to be added from constructor")

        location.add(new ListEntry("Tagret Shooting Solutions", "1056 Gap Newport Pike",
                "Avondale, PA 19311,", "targetshootingsolutions.com",
                "(610) 910-0100", 39.837373, -75.797460, R.drawable.target_shooting_solutions,
                "Indoor shooting range and run store. "));

        location.add(new ListEntry("AMC DINE-IN Painters Crossing 9", "112 Wilmington Pike",
                "West Chester, PA 19382", "amctheatres.com", "(610) 558-4814",
                39.882674, -75.550151, R.drawable.amc_painters_crossing,
                "Eat in theater with most of the seats being recliners. "));

        location.add(new ListEntry("Oasis Family Fun Center", "35 Lacrue Ave",
                "Glen Mills, PA 19342", "oasisfamilyfun.com", "(610) 358-3501",
                39.889146, -75.527572, R.drawable.oasis_family_fun_center,
                "Indoor play area with trampolines and play structures."));

        location.add(new ListEntry("American Helicopter Museum",
                "1220 American Blvd", "West Chester, PA 19380",
                "americanhelicopter.museum", "(610) 436-9600", 39.991854,
                -75.578863, R.drawable.helicopter_museum,
                "Lots of helicopters on display with history on the aircraft as well as a few simulators."));

        location.add(new ListEntry("Brandywine River Museum of Art", "1 Hoffmans Mill Rd",
                "Chadds Ford, PA 19317", "brandywine.org", "(610) 388-2700",
                39.870008, -75.593160, R.drawable.brandywine_museum_of_art,
                "Art museum that regularly has exibits from local schools as well as older paintings."));

        location.add(new ListEntry("Delaware Museum of Natural History", "4840 Kennett Pike",
                "Wilmington, DE 19807", "delmnh.org", "(302) 658-9111",
                39.798183, -75.609807, R.drawable.delaware_museum_of_natural_history,
                "Museum with collections of birds, mammals, mollusks and dinosaurs."));

        location.add(new ListEntry("Longwood Gardens", "1001 Longwood Rd",
                "Kennett Square, PA 19348", "longwoodgardens.org",
                "(610) 388-1000", 39.871269, -75.674722, R.drawable.longwood_gardens,
                "Indoor and outdoor botanical gardens with child friendly attractions for the whole family. "));

        location.add(new ListEntry("Plumpton Park Zoo", "1416 Telegraph Rd",
                "Rising Sun, MD 21911", "plumptonparkzoo.org", "(410) 658-6850",
                39.704549, -76.001396, R.drawable.plumpton_park_zoo,
                "Small well maintained family owned zoo. "));

        location.add(new ListEntry("Brandywine Zoo", "1001 N Park Dr",
                " Wilmington, DE 19802", "brandywinezoo.org", "(302) 571-7747",
                39.755823, -75.549167, R.drawable.brandywine_zoo,
                "Small zoo with a couple dozen animals."));

        location.add(new ListEntry("Herr’s Snack Factory Tour", "271 Old Baltimore Pike",
                "Nottingham, PA 19362", "herrs.com", "(800) 284-7488",
                39.748008, -76.0187100, R.drawable.herrs_snack_facotry_tour,
                "Tour of the Herr's snack factory with some of the company and family history and snacks at the end. "));

        location.add(new ListEntry("Brandywine Battlefield Park",
                "1491 Baltimore Pike", "Chadds Ford, PA 19317",
                "brandywinebattlefield.org", "(610) 459-3342", 39.874516,
                -75.576284, R.drawable.brandywine_battlefield_park,
                "Historic Site of the largest single day battle in the revolutionary war. "));


        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)

        ListEntryAdapter adapter = new ListEntryAdapter(getActivity(), location, R.color.colorAttractions);


        ListView listView = rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ListEntry entry = location.get(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable (ListEntry.TAG, entry);
                MoreInfoFragment fragInfo = new MoreInfoFragment();
                fragInfo.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.text_view_container, fragInfo);
                getFragmentManager().beginTransaction().commit();

            }


        });

        return rootView;

    }

}
