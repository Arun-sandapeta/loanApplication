package com.neoteric.loanApplication.model;

public class LoanApplication {
    private CustomerDetails customerDetails;
    private double loanAmount;
    private int loanTermInYears;

    private double annualSalary;

    public LoanApplication(CustomerDetails customerDetails, double loanAmount, int loanTermInYears,  double annualSalary) {
        this.customerDetails = customerDetails;
        this.loanAmount = loanAmount;
        this.loanTermInYears = loanTermInYears;

        this.annualSalary = annualSalary;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getLoanTermInYears() {
        return loanTermInYears;
    }



    public double getAnnualSalary() {
        return annualSalary;
    }
}
