package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ConfigReader;
import pages.LoginPage;
import pages.NewAccountPage;
import pages.DepositPage;
import pages.WithdrawalPage;
import pages.BalanceEnquiryPage;

public class TransactionTest extends BaseTest {
	
	  @Test(priority = 5)
	    public void openNewAccountPage()
	    {
		  ConfigReader cr = new ConfigReader();

		  LoginPage lp = new LoginPage(driver);

		  lp.login(cr.getUsername(), cr.getPassword());

	        NewAccountPage nap = new NewAccountPage(driver);

	        nap.clickNewAccount();

	        nap.enterCustomerId("78528");
	        
	        nap.selectAccountType();
	        
	        nap.enterInitialDeposit("3000");
	        
	        nap.clickSubmit();
	        
	        String accountId = nap.getAccountId();

	        System.out.println("Generated Account ID: " + accountId);
	    }
	  
	    @Test(priority = 6)
	    public void openDepositPage()
	    {
	    	ConfigReader cr = new ConfigReader();

	    	LoginPage lp = new LoginPage(driver);

	    	lp.login(cr.getUsername(), cr.getPassword());

	        DepositPage dp = new DepositPage(driver);

	        dp.clickDeposit();
	        
	        dp.enterAccountNumber("183781");
	        
	        dp.enterAmount("100");
	        
	        dp.enterDescription("Deposit");
	        
	        dp.clickSubmit();
	    }
	    
	    @Test(priority = 7)
	    public void openWithdrawalPage()
	    {
	    	ConfigReader cr = new ConfigReader();

	    	LoginPage lp = new LoginPage(driver);

	    	lp.login(cr.getUsername(), cr.getPassword());

	        WithdrawalPage wp = new WithdrawalPage(driver);

	        wp.clickWithdrawal();

	        wp.enterAccountNumber("183781");
	        
	        wp.enterAmount("500");
	        
	        wp.enterDescription("Withdraw");
	        
	        wp.clickSubmit();
	    }
	    
	    @Test(priority = 9)
	    public void openBalanceEnquiryPage()
	    {
	    	ConfigReader cr = new ConfigReader();

	    	LoginPage lp = new LoginPage(driver);

	    	lp.login(cr.getUsername(), cr.getPassword());

	        BalanceEnquiryPage bp = new BalanceEnquiryPage(driver);

	        bp.clickBalanceEnquiry();
	        
	        bp.enterAccountNumber("183781");
	        
	        bp.clickSubmit();
	    }

}