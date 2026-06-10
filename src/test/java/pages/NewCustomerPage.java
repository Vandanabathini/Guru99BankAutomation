package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {

    WebDriver driver;

    By newCustomerLink = By.linkText("New Customer");
    By customerName = By.name("name");
    By maleGender = By.xpath("//input[@value='m']");
    By dob = By.id("dob");
    By address = By.name("addr");
    By city = By.name("city");
    By state = By.name("state");
    By pin = By.name("pinno");
    By mobileNumber = By.name("telephoneno");
    By email = By.name("emailid");
    By password = By.name("password");
    By customerIdValue = By.xpath("//td[text()='Customer ID']/following-sibling::td");
    By submitButton = By.name("sub");

    public NewCustomerPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickNewCustomer()
    {
        driver.findElement(newCustomerLink).click();
    }
    
    public void enterCustomerName(String cname)
    {
        driver.findElement(customerName).sendKeys(cname);
    }
    
    public void selectMaleGender()
    {
        driver.findElement(maleGender).click();
    }
    
    public void enterDOB(String date)
    {
        driver.findElement(dob).sendKeys(date);
    }
    
    public void enterAddress(String addr)
    {
        driver.findElement(address).sendKeys(addr);
    }
    
    public void enterCity(String cityName)
    {
        driver.findElement(city).sendKeys(cityName);
    }
    
    public void enterState(String stateName)
    {
        driver.findElement(state).sendKeys(stateName);
    }
    
    public void enterPin(String pinNumber)
    {
        driver.findElement(pin).sendKeys(pinNumber);
    }
    
    public void enterMobileNumber(String mobile)
    {
        driver.findElement(mobileNumber).sendKeys(mobile);
    }
    
    public void enterEmail(String emailId)
    {
        driver.findElement(email).sendKeys(emailId);
    }
    
    public void enterPassword(String pwd)
    {
        driver.findElement(password).sendKeys(pwd);
    }
    
    public String getCustomerId()
    {
        return driver.findElement(customerIdValue).getText();
    }
    
    public void clickSubmit()
    {
        driver.findElement(submitButton).click();
    }
}