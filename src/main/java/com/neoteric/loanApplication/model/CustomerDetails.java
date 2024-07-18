package com.neoteric.loanApplication.model;

public class CustomerDetails {
    private String firstName;
    private String lastName;
    private Address address;
    private String panCardNum;
    private long aadhaarNum;
    private long mobileNumber;

    public CustomerDetails(String firstName, String lastName, Address address, String panCardNum, long aadhaarNum, long mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.panCardNum = panCardNum;
        this.aadhaarNum = aadhaarNum;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getPanCardNum() {
        return panCardNum;
    }

    public long getAadhaarNum() {
        return aadhaarNum;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }
}
