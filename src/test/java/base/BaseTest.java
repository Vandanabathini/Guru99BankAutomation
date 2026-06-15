package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseTest {

    public WebDriver driver;

    public static Logger logger =
            LogManager.getLogger(BaseTest.class);

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();

        logger.info("Launching Chrome Browser");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        logger.info("Opening Guru99 Application");

        driver.get("https://demo.guru99.com/V4/");
    }

    @AfterMethod
    public void tearDown() {

        logger.info("Closing Browser");

        driver.quit();
    }
}
