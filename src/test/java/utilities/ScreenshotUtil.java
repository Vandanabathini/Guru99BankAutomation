package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver,
                                         String fileName)
    {
        try
        {
            File src =
                ((TakesScreenshot)driver)
                .getScreenshotAs(OutputType.FILE);

            File dest =
                new File("screenshots/" + fileName + ".png");

            org.openqa.selenium.io.FileHandler.copy(src, dest);

            System.out.println(
                "Screenshot saved: " + dest.getAbsolutePath());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}