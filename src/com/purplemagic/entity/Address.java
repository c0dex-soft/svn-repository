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

}

