package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class TourGuideActivity extends AppCompatActivity  {

    private TabLayout tabLayout;
    ViewPager viewPager;
    PlacesFragment placesFragment = new PlacesFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_guide);
        tabLayout = findViewById(R.id.tabLayout);

        tabLayout.getTabAt(0);
        viewPager = findViewById(R.id.view_pager);

        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager,true);

    }
}