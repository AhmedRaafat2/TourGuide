package com.example.tourguide;

public class Restaurant {
    private int restaurant_image;
    private String restaurant_name;
    private String restaurant_address;
    private float restaurant_rating;

    public Restaurant(int restaurant_image, String restaurant_name, String restaurant_address, float restaurant_rating) {
        this.restaurant_image = restaurant_image;
        this.restaurant_name = restaurant_name;
        this.restaurant_address = restaurant_address;
        this.restaurant_rating = restaurant_rating;
    }

    public int getRestaurant_image() {
        return restaurant_image;
    }

    public void setRestaurant_image(int restaurant_image) {
        this.restaurant_image = restaurant_image;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getRestaurant_address() {
        return restaurant_address;
    }

    public void setRestaurant_address(String restaurant_address) {
        this.restaurant_address = restaurant_address;
    }

    public float getRestaurant_rating() {
        return restaurant_rating;
    }

    public void setRestaurant_rating(float restaurant_rating) {
        this.restaurant_rating = restaurant_rating;
    }
}
