package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FundTransferPage {

    WebDriver driver;

    By fundTransferLink = By.linkText("Fund Transfer");
    By payerAccount = By.name("payersaccount");
    By payeeAccount = By.name("payeeaccount");
    By amount = By.name("ammount");
    By description = By.name("desc");
    By submitButton = By.name("AccSubmit");

    public FundTransferPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickFundTransfer()
    {
        driver.findElement(fundTransferLink).sendKeys(org.openqa.selenium.Keys.ENTER);
    }
    
    public void enterPayerAccount(String accountNo)
    {
        driver.findElement(payerAccount).sendKeys(accountNo);
    }
    
    public void enterPayeeAccount(String accountNo)
    {
        driver.findElement(payeeAccount).sendKeys(accountNo);
    }
    
    public void enterAmount(String transferAmount)
    {
        driver.findElement(amount).sendKeys(transferAmount);
    }
    
    public void enterDescription(String desc)
    {
        driver.findElement(description).sendKeys(desc);
    }
    
    public void clickSubmit()
    {
        driver.findElement(submitButton).click();
    }
}