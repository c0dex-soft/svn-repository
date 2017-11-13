package com.purplemagic.entity;

import java.util.Date;

public class Human {

    private int id;
    private String name;
    private String surename;
    private String address;
    private String email;
    private Date dob;
    private boolean car;
    private boolean motocycle;
    private String father;
    private String mother;
    private int jmbg;

    public Human(int id, String name, String surename, String address, String email, Date dob, boolean car, boolean motocycle,
                 String father, String mother, int jmbg) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.address = address;
        this.email = email;
        this.dob = dob;
        this.car = car;
        this.motocycle = motocycle;
        this.father = father;
        this.mother = mother;
        this.jmbg = jmbg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public boolean isMotocycle() {
        return motocycle;
    }

    public void setMotocycle(boolean motocycle) {
        this.motocycle = motocycle;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    @Override
    public String toString() {
        return "Human{" + "id=" + id + ", name='" + name + '\'' + ", surename='" + surename + '\'' + ", address='" + address +
                '\'' + ", email='" + email + '\'' + ", dob=" + dob + ", car=" + car + ", motocycle=" + motocycle + ", father='"
                + father + '\'' + ", mother='" + mother + '\'' + ", jmbg=" + jmbg + '}';
    }
}
