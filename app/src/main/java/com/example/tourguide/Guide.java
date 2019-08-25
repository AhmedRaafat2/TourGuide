package com.example.tourguide;

public class Guide {
    private String name;
    private String phone;
    private String gender;
    private double priceHour;

    public Guide(String name, String phone, String gender, double priceHour) {
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }
}