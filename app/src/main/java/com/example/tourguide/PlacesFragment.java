package com.example.tourguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class PlacesFragment extends Fragment implements View.OnClickListener {

    private RecyclerView placesRecyclerView;
    private ListView listView;
    private ArrayList<Place> places = new ArrayList<>();

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View placesFragmentView = inflater.inflate(R.layout.fragment_places, container, false);

        placesRecyclerView = placesFragmentView.findViewById(R.id.places_listView);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        places.add(new Place(R.drawable.place1,getResources().getString(R.string.place1_name),getResources().getString(R.string.place1_address),getResources().getString(R.string.place1_description)));
        places.add(new Place(R.drawable.place2,getResources().getString(R.string.place2_name),getResources().getString(R.string.place2_address),getResources().getString(R.string.place2_description)));
        places.add(new Place(R.drawable.place3,getResources().getString(R.string.place3_name),getResources().getString(R.string.place3_address),getResources().getString(R.string.place3_description)));
        places.add(new Place(R.drawable.place4,getResources().getString(R.string.place4_name),getResources().getString(R.string.place4_address),getResources().getString(R.string.place4_description)));
        places.add(new Place(R.drawable.place5,getResources().getString(R.string.place5_name),getResources().getString(R.string.place5_address),getResources().getString(R.string.place5_description)));
        places.add(new Place(R.drawable.place6,getResources().getString(R.string.place6_name),getResources().getString(R.string.place6_address),getResources().getString(R.string.place6_description)));
        places.add(new Place(R.drawable.place7,getResources().getString(R.string.place7_name),getResources().getString(R.string.place7_address),getResources().getString(R.string.place7_description)));
        places.add(new Place(R.drawable.place8,getResources().getString(R.string.place8_name),getResources().getString(R.string.place8_address),getResources().getString(R.string.place8_description)));
        places.add(new Place(R.drawable.place9,getResources().getString(R.string.place9_name),getResources().getString(R.string.place9_address),getResources().getString(R.string.place9_description)));


        PlacesListAdapter adapter = new PlacesListAdapter(getContext(),places);

        placesRecyclerView.setAdapter(adapter);
        placesRecyclerView.setOnClickListener(this);

        return placesFragmentView;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(),"A7aaaaaaaaaa",Toast.LENGTH_LONG).show();
    }
}