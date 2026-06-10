package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithdrawalPage {

    WebDriver driver;

    By withdrawalLink = By.linkText("Withdrawal");
    By accountNumber = By.name("accountno");
    By amount = By.name("ammount");
    By description = By.name("desc");
    By submitButton = By.name("AccSubmit");

    public WithdrawalPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickWithdrawal()
    {
        driver.findElement(withdrawalLink).click();
    }
    
    public void enterAccountNumber(String accNo)
    {
        driver.findElement(accountNumber).sendKeys(accNo);
    }
    
    public void enterAmount(String withdrawAmount)
    {
        driver.findElement(amount).sendKeys(withdrawAmount);
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