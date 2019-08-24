package com.example.tourguide;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class PlacesListAdapter extends RecyclerView.Adapter<PlacesListAdapter.placeHolder> implements View.OnClickListener {
    private Context context;
    private ArrayList<Place> places;
    private Place currentPlace;
    public PlacesListAdapter(@NonNull Context context, @NonNull ArrayList<Place> places) {
        this.context = context;
        this.places = places;
    }

    @NonNull
    @Override
    public placeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new placeHolder(LayoutInflater.from(context).inflate(R.layout.item_place,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull placeHolder holder, int position) {
        Place currentPlace = places.get(position);
        this.currentPlace = places.get(position);
        holder.placeName.setText(currentPlace.getNameForPlace());
        holder.placeImage.setImageResource(currentPlace.getImageForPlace());
        //For adding on item click listner..
        holder.placeParentView.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    @Override
    public void onClick(View view) {

        //Fore start new Activity with sendind the current data for the selected place in position..
        Intent intent = new Intent(context,PlaceDetailsActivity.class);
        intent.putExtra("current_place",currentPlace);
        Toast.makeText(context,""+currentPlace.getNameForPlace(),Toast.LENGTH_LONG).show();
        context.startActivity(intent);
    }
    class placeHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView placeName;
        //For adding on item click listner..
        ConstraintLayout placeParentView;
        public placeHolder(@NonNull View itemView) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.place_imageView);
            placeName = itemView.findViewById(R.id.place_name_textView);
            placeParentView = itemView.findViewById(R.id.item_place_parent_view);
        }
    }
}