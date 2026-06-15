package testcases;

import org.testng.annotations.Test;

import base.BaseTest;

import pages.LoginPage;
import pages.NewCustomerPage;
import utilities.ConfigReader;

public class CustomerTest extends BaseTest {
    
    @Test(priority = 4)
    public void openNewCustomerPage()
    {
        ConfigReader cr = new ConfigReader();
        
        LoginPage lp = new LoginPage(driver);

        lp.login(cr.getUsername(), cr.getPassword());

        NewCustomerPage ncp = new NewCustomerPage(driver);

        ncp.clickNewCustomer();
        
        ncp.enterCustomerName("Arjun");
        
        ncp.selectMaleGender();
        
        ncp.enterDOB("01-01-1995");
        
        ncp.enterAddress("Hyderabad");
        
        ncp.enterCity("Hyderabad");
        
        ncp.enterState("Telangana");
        
        ncp.enterPin("500001");
        
        ncp.enterMobileNumber("9876543210");
        
        String email = "user" + System.currentTimeMillis() + "@gmail.com";

        ncp.enterEmail(email);
        
        ncp.enterPassword("Arjun@123");
        
        ncp.clickSubmit();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String customerId = ncp.getCustomerId();

        System.out.println("Generated Customer ID: " + customerId);
    }

}