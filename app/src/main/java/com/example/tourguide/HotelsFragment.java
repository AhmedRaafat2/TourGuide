package com.example.tourguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    private RecyclerView hotelsList;
    private ArrayList<Hotel> hotels= new ArrayList<>();

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentHotelParent = inflater.inflate(R.layout.fragment_hotels, container, false);
        hotelsList = fragmentHotelParent.findViewById(R.id.hotels_listView);
        hotelsList.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        hotels.add(new Hotel(R.drawable.hotel1,getResources().getString(R.string.hotel1_name),getResources().getString(R.string.hotel1_address),5.0f));
        hotels.add(new Hotel(R.drawable.hotel2,getResources().getString(R.string.hotel2_name),getResources().getString(R.string.hotel2_address),4.0f));
        hotels.add(new Hotel(R.drawable.hotel3,getResources().getString(R.string.hotel3_name),getResources().getString(R.string.hotel3_address),5.0f));
        hotels.add(new Hotel(R.drawable.hotel4,getResources().getString(R.string.hotel4_name),getResources().getString(R.string.hotel4_address),5.0f));
        hotels.add(new Hotel(R.drawable.hotel5,getResources().getString(R.string.hotel5_name),getResources().getString(R.string.hotel5_address),3.0f));
        hotels.add(new Hotel(R.drawable.hotel6,getResources().getString(R.string.hotel6_name),getResources().getString(R.string.hotel6_address),3.0f));
        hotels.add(new Hotel(R.drawable.hotel7,getResources().getString(R.string.hotel7_name),getResources().getString(R.string.hotel7_address),5.0f));



        HotelListAdapter adapter = new HotelListAdapter(getContext(),hotels);
        hotelsList.setAdapter(adapter);
        return fragmentHotelParent;
    }
}