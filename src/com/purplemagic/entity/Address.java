package com.purplemagic.entity;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;
    private int number;

    public Address(String street, String city, String state, String zip, int number) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

