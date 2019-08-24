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
public class RestaurantsFragment extends Fragment {

    private RecyclerView restaurants_list;
    private ArrayList<Restaurant> restaurants = new ArrayList<>();
    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View restaurantParentView = inflater.inflate(R.layout.fragment_restaurants, container, false);
        restaurants_list = restaurantParentView.findViewById(R.id.restaurant_list);
        restaurants_list.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        restaurants.add(new Restaurant(R.drawable.resraurant1,getResources().getString(R.string.restaurant1_name),getResources().getString(R.string.restaurant1_address),5.0f));
        restaurants.add(new Restaurant(R.drawable.resraurant2,getResources().getString(R.string.restaurant2_name),getResources().getString(R.string.restaurant2_address),5.0f));
        restaurants.add(new Restaurant(R.drawable.resraurant3,getResources().getString(R.string.restaurant3_name),getResources().getString(R.string.restaurant3_address),4.0f));
        restaurants.add(new Restaurant(R.drawable.resraurant4,getResources().getString(R.string.restaurant4_name),getResources().getString(R.string.restaurant4_address),4.5f));
        restaurants.add(new Restaurant(R.drawable.resraurant5,getResources().getString(R.string.restaurant5_name),getResources().getString(R.string.restaurant5_address),4.5f));
        restaurants.add(new Restaurant(R.drawable.resraurant6,getResources().getString(R.string.restaurant6_name),getResources().getString(R.string.restaurant6_address),4.5f));
        restaurants.add(new Restaurant(R.drawable.resraurant7,getResources().getString(R.string.restaurant7_name),getResources().getString(R.string.restaurant7_address),4.0f));
        RestaurantAdapter adapter = new RestaurantAdapter(getContext(),restaurants);
        restaurants_list.setAdapter(adapter);
        return restaurantParentView;
    }
}