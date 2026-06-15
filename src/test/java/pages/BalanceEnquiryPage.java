package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

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
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].click();",
                driver.findElement(balanceEnquiryLink)
        );
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