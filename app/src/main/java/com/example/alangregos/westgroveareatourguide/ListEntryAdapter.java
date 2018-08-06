package com.example.alangregos.westgroveareatourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListEntryAdapter extends ArrayAdapter<ListEntry> {

    private int mbackroundColor;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context   The current context. Used to inflate the layout file.
     * @param listEntry A List of AndroidFlavor objects to display in a list
     */

    public ListEntryAdapter(Activity context, ArrayList<ListEntry> listEntry, int backroundColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, listEntry);
        mbackroundColor = backroundColor;
    }

    /*
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link ListEntry} object located at this position in the list
        ListEntry currentListEntry = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name);

        // Get the version name from the current ListEntry object and
        // set this text on the name TextView
        nameTextView.setText(currentListEntry.getmBussinessName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView streetTextView = (TextView) listItemView.findViewById(R.id.location_street_address);

        // Get the version number from the current ListEntry object and
        // set this text on the street address TextView
        streetTextView.setText(currentListEntry.getmBussinessStreetAddress());

        // Find the TextView in the list_item.xml layout with the ID location_city_state_zip
        TextView cityStateZipTextView = (TextView) listItemView.findViewById(R.id.location_city_state_zip);

        // Get the version number from the current ListEntry object and
        // set this text on the city, state, zip TextView
        cityStateZipTextView.setText(currentListEntry.getmCityStateZip());

        // Find the TextView in the list_item.xml layout for the phone number
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.location_phone_number);

        // Get the version number from the current ListEntry object and
        // set this text on the phone number TextView
        phoneTextView.setText(currentListEntry.getmPhoneNumber());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.location_image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView

        //set the backround color of all the text views in the list
        View container = (View) listItemView.findViewById(R.id.text_view_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mbackroundColor);
        container.setBackgroundColor(color);

        //decide if the image view will be rendered removed from the layout
        if (currentListEntry.hasImage()) {
            iconView.setImageResource(currentListEntry.getmImage());
            iconView.setVisibility(View.VISIBLE);

        } else iconView.setVisibility(View.GONE);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}