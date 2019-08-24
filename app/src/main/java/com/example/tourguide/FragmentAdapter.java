package com.example.tourguide;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {

    // tab titles
    private String[] tabTitles = new String[]{"Restaurants", "Places", "Hotels"};

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new RestaurantsFragment();
        }else if (position == 1){
            return new PlacesFragment();
        }else if (position == 2){
            return new HotelsFragment();
        }else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}