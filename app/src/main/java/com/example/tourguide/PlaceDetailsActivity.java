package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetailsActivity extends AppCompatActivity {

    private Place recieved_place;
    private ImageView placeImage;
    private TextView plceName;
    private TextView placeAddress;
    private TextView placeDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);
        //recieving the sent place
        recieved_place = (Place) getIntent().getSerializableExtra("current_place");
        placeImage = findViewById(R.id.place_imageView);
        plceName = findViewById(R.id.place_name_textView);
        placeAddress = findViewById(R.id.place_address_textView);
        placeDescription = findViewById(R.id.place_description_textView);

        placeImage.setImageResource(recieved_place.getImageForPlace());
        plceName.setText(recieved_place.getNameForPlace());
        placeAddress.setText("Address : "+recieved_place.getAddressForPlace());
        placeDescription.setText("Description :- \n"+recieved_place.getDescriptionForPlace());

    }
}