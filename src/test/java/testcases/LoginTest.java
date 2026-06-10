package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.ExcelUtils;
import utilities.ScreenshotUtil;

public class LoginTest extends BaseTest {

	@Test(priority = 1)
	public void validLogin()
	{
	    ExcelUtils excel = new ExcelUtils();

	    String username = excel.getCellData(1, 0);

	    String password = excel.getCellData(1, 1);

	    LoginPage lp = new LoginPage(driver);

	    lp.login(username, password);
	}
    
    @Test(priority = 2)
    public void invalidLogin()
    {
        LoginPage lp = new LoginPage(driver);

        lp.login("wronguser", "wrongpass");

        String alertText = lp.getAlertText();

        Assert.assertTrue(alertText.contains("User or Password"));
    }
    
    @Test(priority = 3)
    public void emptyLogin()
    {
        LoginPage lp = new LoginPage(driver);

        lp.clickLogin();

        String alertText = lp.getAlertText();

        Assert.assertTrue(alertText.contains("User or Password is not valid"));
    }
    
    @Test(priority = 10)
    public void readExcelData()
    {
        ExcelUtils excel = new ExcelUtils();

        String username = excel.getCellData(1, 0);

        String password = excel.getCellData(1, 1);

        System.out.println("Username: " + username);

        System.out.println("Password: " + password);
    }
    
    @Test(priority = 20)
    public void testScreenshot()
    {
        ScreenshotUtil.captureScreenshot(driver, "TestImage");
    }
}