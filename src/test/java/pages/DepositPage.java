package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPage {

    WebDriver driver;

    By depositLink = By.linkText("Deposit");
    By accountNumber = By.name("accountno");
    By amount = By.name("ammount");
    By description = By.name("desc");
    By submitButton = By.name("AccSubmit");

    public DepositPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickDeposit()
    {
        driver.findElement(depositLink).click();
    }
    
    public void enterAccountNumber(String accNo)
    {
        driver.findElement(accountNumber).sendKeys(accNo);
    }
    
    public void enterAmount(String depositAmount)
    {
        driver.findElement(amount).sendKeys(depositAmount);
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