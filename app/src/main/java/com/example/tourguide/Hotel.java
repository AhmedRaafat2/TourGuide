package com.example.tourguide;

public class Hotel {
    private int hotel_image;
    private String hotel_name;
    private String hotel_address;
    private float hotel_rating;

    public Hotel(int hotel_image, String hotel_name, String hotel_address, float hotel_rating) {
        this.hotel_image = hotel_image;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_rating = hotel_rating;
    }

    public int getHotel_image() {
        return hotel_image;
    }

    public void setHotel_image(int hotel_image) {
        this.hotel_image = hotel_image;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public float getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_rating(float hotel_rating) {
        this.hotel_rating = hotel_rating;
    }
}