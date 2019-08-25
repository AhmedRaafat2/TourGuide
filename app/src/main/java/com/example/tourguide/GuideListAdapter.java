package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class GuideListAdapter extends RecyclerView.Adapter<GuideListAdapter.GuideHolder> {

    private Context context;
    private ArrayList<Guide> guides;

    public GuideListAdapter(Context context, ArrayList<Guide> guides) {
        this.context = context;
        this.guides = guides;
    }

    @NonNull
    @Override
    public GuideHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GuideHolder(LayoutInflater.from(context).inflate(R.layout.item_guide,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GuideHolder holder, int position) {

        Guide current_guide = guides.get(position);
        holder.guideName.setText(current_guide.getName());
        holder.guidePhone.setText(current_guide.getPhone());
        holder.guideGender.setText(current_guide.getGender());
        holder.guidePrice.setText(current_guide.getPriceHour()+context.getString(R.string.dollarPerHour));
    }

    @Override
    public int getItemCount() {
        return guides.size();
    }

    class GuideHolder extends RecyclerView.ViewHolder{

        TextView guideName;
        TextView guidePhone;
        TextView guideGender;
        TextView guidePrice;
        public GuideHolder(@NonNull View itemView) {
            super(itemView);
            guideName = itemView.findViewById(R.id.guide_name);
            guidePhone = itemView.findViewById(R.id.guide_phone);
            guideGender = itemView.findViewById(R.id.guide_gender);
            guidePrice = itemView.findViewById(R.id.guide_price);
        }
    }
}