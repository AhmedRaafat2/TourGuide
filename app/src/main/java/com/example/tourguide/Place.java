package com.example.tourguide;

import java.io.Serializable;

public class Place implements Serializable {

    private int imageForPlace;
    private String nameForPlace;
    private String addressForPlace;
    private String descriptionForPlace;

    public Place(int imageForPlace, String nameForPlace, String addressForPlace, String descriptionForPlace) {
        this.imageForPlace = imageForPlace;
        this.nameForPlace = nameForPlace;
        this.addressForPlace = addressForPlace;
        this.descriptionForPlace = descriptionForPlace;
    }

    public int getImageForPlace() {
        return imageForPlace;
    }

    public void setImageForPlace(int imageForPlace) {
        this.imageForPlace = imageForPlace;
    }

    public String getNameForPlace() {
        return nameForPlace;
    }

    public void setNameForPlace(String nameForPlace) {
        this.nameForPlace = nameForPlace;
    }

    public String getAddressForPlace() {
        return addressForPlace;
    }

    public void setAddressForPlace(String addressForPlace) {
        this.addressForPlace = addressForPlace;
    }

    public String getDescriptionForPlace() {
        return descriptionForPlace;
    }

    public void setDescriptionForPlace(String descriptionForPlace) {
        this.descriptionForPlace = descriptionForPlace;
    }
}