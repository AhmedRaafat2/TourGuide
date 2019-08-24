package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder>{

    private ArrayList<Restaurant> restaurants;
    private Context context;

    public RestaurantAdapter( Context context, ArrayList<Restaurant> restaurants) {
        this.context = context;
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public RestaurantHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RestaurantHolder(LayoutInflater.from(context).inflate(R.layout.item_restaurant,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantHolder holder, int position) {

        Restaurant current_restaurant = restaurants.get(position);
        holder.rest_image.setImageResource(current_restaurant.getRestaurant_image());
        holder.rest_name.setText(current_restaurant.getRestaurant_name());
        holder.rest_add.setText(current_restaurant.getRestaurant_address());
        holder.rest_rating.setRating(current_restaurant.getRestaurant_rating());
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    class RestaurantHolder extends RecyclerView.ViewHolder{

        ImageView rest_image;
        TextView rest_name;
        TextView rest_add;
        RatingBar rest_rating;
        public RestaurantHolder(@NonNull View itemView) {
            super(itemView);
            rest_image = itemView.findViewById(R.id.restaurant_imageView);
            rest_name = itemView.findViewById(R.id.restaurant_name);
            rest_add = itemView.findViewById(R.id.restaurant_address);
            rest_rating = itemView.findViewById(R.id.restaurant_ratingBar);
        }
    }
}