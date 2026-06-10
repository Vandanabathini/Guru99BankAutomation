package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BalanceEnquiryPage {

    WebDriver driver;

    By balanceEnquiryLink = By.linkText("Balance Enquiry");
    By accountNumber = By.name("accountno");
    By submitButton = By.name("AccSubmit");

    public BalanceEnquiryPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickBalanceEnquiry()
    {
        driver.findElement(balanceEnquiryLink).click();
    }
    
    public void enterAccountNumber(String accNo)
    {
        driver.findElement(accountNumber).sendKeys(accNo);
    }
    
    public void clickSubmit()
    {
        driver.findElement(submitButton).click();
    }
}