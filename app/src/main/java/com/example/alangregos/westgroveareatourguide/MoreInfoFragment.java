package com.example.alangregos.westgroveareatourguide;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class MoreInfoFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Serializable serializable = savedInstanceState.getSerializable(ListEntry.TAG);
        ListEntry current = (ListEntry) serializable;
        View rootView = inflater.inflate(R.layout.expanded_information, container, false);



        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) rootView.findViewById(R.id.location_name);

        // Get the version name from the current ListEntry object and
        // set this text on the name TextView
        nameTextView.setText(current.getmBussinessName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView streetTextView = (TextView) rootView.findViewById(R.id.location_street_address);

        // Get the version number from the current ListEntry object and
        // set this text on the street address TextView
        streetTextView.setText(current.getmBussinessStreetAddress());

        // Find the TextView in the list_item.xml layout with the ID location_city_state_zip
        TextView cityStateZipTextView = (TextView) rootView.findViewById(R.id.location_city_state_zip);

        // Get the version number from the current ListEntry object and
        // set this text on the city, state, zip TextView
        cityStateZipTextView.setText(current.getmCityStateZip());

        // Find the TextView in the list_item.xml layout for the phone number
        TextView phoneTextView = (TextView) rootView.findViewById(R.id.location_phone_number);

        // Get the version number from the current ListEntry object and
        // set this text on the phone number TextView
        phoneTextView.setText(current.getmPhoneNumber());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) rootView.findViewById(R.id.location_image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(current.getmImage());

        return rootView;

    }
}
