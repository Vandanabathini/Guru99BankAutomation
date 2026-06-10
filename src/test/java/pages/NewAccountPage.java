package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {

    WebDriver driver;

    By newAccountLink = By.linkText("New Account");
    By customerId = By.name("cusid");
    By accountType = By.name("selaccount");
    By initialDeposit = By.name("inideposit");
    By submitButton = By.name("button2");
    By accountIdValue = By.xpath("//td[text()='Account ID']/following-sibling::td");

    public NewAccountPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickNewAccount()
    {
        driver.findElement(newAccountLink).click();
    }
    
    public void enterCustomerId(String custId)
    {
        driver.findElement(customerId).sendKeys(custId);
    }
    
    public void selectAccountType()
    {
        Select select = new Select(driver.findElement(accountType));

        select.selectByVisibleText("Current");
    }
    
    public void enterInitialDeposit(String amount)
    {
        driver.findElement(initialDeposit).sendKeys(amount);
    }
    
    public void clickSubmit()
    {
        driver.findElement(submitButton).click();
    }
    
    public String getAccountId()
    {
        return driver.findElement(accountIdValue).getText();
    }
}