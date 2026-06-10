package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import utilities.WaitUtils;

public class LoginPage {

    WebDriver driver;

    By userId = By.name("uid");
    By password = By.name("password");
    By loginButton = By.name("btnLogin");
    By managerIdText = By.xpath("//td[contains(text(),'Manger Id')]");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUserId(String uid)
    {
        driver.findElement(userId).sendKeys(uid);
    }
    
    public void enterPassword(String pwd)
    {
        driver.findElement(password).sendKeys(pwd);
    }
    
    public void clickLogin()
    {
        WaitUtils wait = new WaitUtils(driver);

        wait.waitForElementClickable(loginButton);

        driver.findElement(loginButton).click();
    }
    
    public void login(String uid, String pwd)
    {
        enterUserId(uid);
        enterPassword(pwd);
        clickLogin();
    }
    
    public String getManagerIdText()
    {
        return driver.findElement(managerIdText).getText();
    }
    
    public String getAlertText()
    {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        Alert alert = driver.switchTo().alert();

        String alertMessage = alert.getText();

        alert.accept();

        return alertMessage;
    }
}