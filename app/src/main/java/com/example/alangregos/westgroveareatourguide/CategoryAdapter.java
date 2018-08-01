package com.example.alangregos.westgroveareatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0: {
                //Dining
                fragment = new com.example.alangregos.westgroveareatourguide.DiningFragment();
                break;
            }
            case 1: {
                //Shopping
                fragment = new com.example.alangregos.westgroveareatourguide.ShoppingFragment();
                break;
            }
            case 2: {
                //Parks
               fragment = new com.example.alangregos.westgroveareatourguide.ParksFragment();
                break;
            }
            case 3: {
                //Attractions
                fragment = new com.example.alangregos.westgroveareatourguide.AttractionsFragment();
                break;
            }
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }


    /*
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getString(R.string.category_colors);
        } else {
            return mContext.getString(R.string.category_phrases);
        }
        */
}
