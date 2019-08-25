package com.example.tourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LocalGuideFragment extends Fragment {

    private RecyclerView guideListView;
    private ArrayList<Guide> guides = new ArrayList<>();

    public LocalGuideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View guideFragmentParentView = inflater.inflate(R.layout.fragment_local_guide, container, false);
        guideListView = guideFragmentParentView.findViewById(R.id.guide_list_view);
        guideListView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        guides.add(new Guide(getResources().getString(R.string.guide1_name),getResources().getString(R.string.guide1_phone),getResources().getString(R.string.guide1_gender),10.0));
        guides.add(new Guide(getResources().getString(R.string.guide2_name),getResources().getString(R.string.guide2_phone),getResources().getString(R.string.guide2_gender),9.0));
        guides.add(new Guide(getResources().getString(R.string.guide3_name),getResources().getString(R.string.guide3_phone),getResources().getString(R.string.guide3_gender),11.0));
        guides.add(new Guide(getResources().getString(R.string.guide4_name),getResources().getString(R.string.guide4_phone),getResources().getString(R.string.guide4_gender),15.0));
        guides.add(new Guide(getResources().getString(R.string.guide5_name),getResources().getString(R.string.guide5_phone),getResources().getString(R.string.guide5_gender),13.0));
        guides.add(new Guide(getResources().getString(R.string.guide6_name),getResources().getString(R.string.guide6_phone),getResources().getString(R.string.guide6_gender),20.0));
        guides.add(new Guide(getResources().getString(R.string.guide7_name),getResources().getString(R.string.guide7_phone),getResources().getString(R.string.guide7_gender),12.0));

        GuideListAdapter adapter = new GuideListAdapter(getContext(),guides);
        guideListView.setAdapter(adapter);
        return guideFragmentParentView;
    }

}
