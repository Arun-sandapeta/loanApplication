package com.neoteric.loanApplication.model;

public class Address {
    private String flatNum;
    private String street;
    private String area;
    private String pinCode;
    private String City;
    private String State;

    public Address(String flatNum, String street, String area, String pinCode, String city, String state) {
        this.flatNum = flatNum;
        this.street = street;
        this.area = area;
        this.pinCode = pinCode;
        City = city;
        State = state;
    }

    public String getFlatNum() {
        return flatNum;
    }

    public String getStreet() {
        return street;
    }

    public String getArea() {
        return area;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }
}
