package com.neoteric.loanApplication.service;

import com.neoteric.loanApplication.model.LoanApplication;


public class LoanService {

    private static final double savingPercentage = 0.6;
    private static final double maxMonthlyPaymentPercentage = 0.6;
    private static final double annualInterestRate = 5.0;
    // Static annual interest rate

    public double calculateMonthlyPayments(LoanApplication loanApplication){
        double principle = loanApplication.getLoanAmount();
        int loanTermInYears = loanApplication.getLoanTermInYears();
        double monthlyInterestRate = annualInterestRate/12/100;
        int numberOfPayments = loanTermInYears * 12;


        double monthlyPayment = (principle * monthlyInterestRate) /(1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.println(monthlyPayment);
        return monthlyPayment;
    }

    public boolean isLoanAffordable(LoanApplication loanApplication){

       double monthlySalary = loanApplication.getAnnualSalary()/12;
       double savings = monthlySalary * savingPercentage;
       double maxMonthlyPayments = savings * maxMonthlyPaymentPercentage;
       double monthlyPayment = calculateMonthlyPayments(loanApplication);

       return  monthlyPayment <= maxMonthlyPayments;


    }
    public String processLoanApplication(LoanApplication loanApplication) {
        if (isLoanAffordable(loanApplication)) {

            int randomApplicationNumber = (int) (Math.random() * 99999) + 10000;
            String numberForApplication = String.valueOf(randomApplicationNumber);

            String applicationNumber = "SBI"+numberForApplication;

            int randomNumber = (int) (Math.random() * 99999) + 10000;
            String number = String.valueOf(randomNumber);
            String loanId = "SBI" + number;

            double monthlyPayment = calculateMonthlyPayments(loanApplication);

            System.out.println("Application Number "+applicationNumber);
            System.out.println("LoanID "+loanId);
            System.out.println("Loan Application for: " + loanApplication.getCustomerDetails().getFirstName());
            System.out.println("Loan Amount: " + loanApplication.getLoanAmount());
            System.out.println("Loan Term (Years): " + loanApplication.getLoanTermInYears());
            System.out.println("Annual Interest Rate: " + annualInterestRate);
            System.out.println("Annual Salary: " + loanApplication.getAnnualSalary());
            System.out.println("Monthly Payment: " + monthlyPayment);
            System.out.println("Loan is affordable.");
            return applicationNumber;
        } else {
            System.out.println("Loan Application for: " + loanApplication.getCustomerDetails().getFirstName());
            System.out.println("The loan is not affordable based on the provided salary.");
            return null;
        }

}
}
