package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ConfigReader;
import pages.LoginPage;
import pages.FundTransferPage;

public class TransferTest extends BaseTest {
	
    @Test(priority = 8)
    public void openFundTransferPage()
    {
    	ConfigReader cr = new ConfigReader();

    	LoginPage lp = new LoginPage(driver);

    	lp.login(cr.getUsername(), cr.getPassword());

        FundTransferPage fp = new FundTransferPage(driver);

        fp.clickFundTransfer();
        
        fp.enterPayerAccount("183781");
        
        fp.enterPayeeAccount("183786");
        
        fp.enterAmount("500");
        
        fp.enterDescription("Transfer");
        
        fp.clickSubmit();
    }

}