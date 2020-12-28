package com.example.projecttestingforsmartdevice.models;

public class Address {
    String Name;
    String AddressLane;
    String City;
    String PostalCode;

    public Address(String name, String addressLane, String city, String postalCode) {
        Name = name;
        AddressLane = addressLane;
        City = city;
        PostalCode = postalCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddressLane() {
        return AddressLane;
    }

    public void setAddressLane(String addressLane) {
        AddressLane = addressLane;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }
}
