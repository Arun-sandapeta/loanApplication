package com.neoteric.loanApplication;

import com.neoteric.loanApplication.model.Address;
import com.neoteric.loanApplication.model.CustomerDetails;
import com.neoteric.loanApplication.model.LoanApplication;
import com.neoteric.loanApplication.service.LoanService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanTest {

    @Test

    void loanStatus(){
        Address address = new Address("101","Hafeezpet","Miyapur","500049","HYD","Telangana");
        CustomerDetails customerDetails = new CustomerDetails("Arun","Kumar", address,"1234",123456,9133724639L);
        LoanApplication application = new LoanApplication(customerDetails,1000000,5,1000000);

        LoanService loanService = new LoanService();
        boolean loanStatusSuccess = loanService.isLoanAffordable(application);

       Assertions.assertTrue(loanStatusSuccess,"Expected loan to be approved");
    }



    @Test
    void loanStatusFailed(){
        Address address = new Address("101","Hafeezpet","Miyapur","500049","HYD","Telangana");
        CustomerDetails customerDetails = new CustomerDetails("Arun","Kumar", address,"1234",123456,9133724639L);
        LoanApplication application = new LoanApplication(customerDetails,1000000,1,1000000);

        LoanService loanService = new LoanService();
        boolean loanStatus = loanService.isLoanAffordable(application);

        Assertions.assertTrue(loanStatus,"Expected loan to be approved");
    }

    @Test
    void applicationID(){
        Address address = new Address("101","Hafeezpet","Miyapur","500049","HYD","Telangana");
        CustomerDetails customerDetails = new CustomerDetails("Arun","Kumar", address,"1234",123456,9133724639L);
        LoanApplication application = new LoanApplication(customerDetails,1000000,5,1000000);

        LoanService loanService = new LoanService();
        String id= loanService.processLoanApplication(application);
        Assertions.assertNotNull(id,"expected application Id to be generated");
    }

    @Test
    void loanId(){
        Address address = new Address("101","Hafeezpet","Miyapur","500049","HYD","Telangana");
        CustomerDetails customerDetails = new CustomerDetails("Arun","Kumar", address,"1234",123456,9133724639L);
        LoanApplication application = new LoanApplication(customerDetails,1000000,5,1000000);

        LoanService loanService = new LoanService();
        String loanId = loanService.processLoanApplication(application);

        Assertions.assertNotNull(loanId);
    }

    @Test
    void monthlyPayments(){
        Address address = new Address("101","Hafeezpet","Miyapur","500049","HYD","Telangana");
        CustomerDetails customerDetails = new CustomerDetails("Arun","Kumar", address,"1234",123456,9133724639L);
        LoanApplication application = new LoanApplication(customerDetails,1000000,5,1000000);

        LoanService loanService = new LoanService();
        double Emi = loanService.calculateMonthlyPayments(application);

        Assertions.assertNotNull(Emi);
    }


}
