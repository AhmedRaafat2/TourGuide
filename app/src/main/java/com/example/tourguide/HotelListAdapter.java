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

public class HotelListAdapter extends RecyclerView.Adapter<HotelListAdapter.HotelHolder> {
    private Context context;
    private ArrayList<Hotel> hotels;

    public HotelListAdapter(Context context, ArrayList<Hotel> hotels) {
        this.context = context;
        this.hotels = hotels;
    }

    @NonNull
    @Override
    public HotelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HotelHolder(LayoutInflater.from(context).inflate(R.layout.item_hotel,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HotelHolder holder, int position) {

        Hotel current_hotel = hotels.get(position);
        holder.hotel_image.setImageResource(current_hotel.getHotel_image());
        holder.hotel_name.setText(current_hotel.getHotel_name());
        holder.hotel_add.setText(current_hotel.getHotel_address());
        holder.hotel_rating.setRating(current_hotel.getHotel_rating());
    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }

    class HotelHolder extends RecyclerView.ViewHolder{

        ImageView hotel_image;
        TextView hotel_name;
        TextView hotel_add;
        RatingBar hotel_rating;
        public HotelHolder(@NonNull View itemView) {
            super(itemView);
            hotel_image = itemView.findViewById(R.id.hotel_imageView);
            hotel_name = itemView.findViewById(R.id.hotel_name);
            hotel_add = itemView.findViewById(R.id.hotel_address);
            hotel_rating = itemView.findViewById(R.id.hotel_ratingBar);
        }
    }
}