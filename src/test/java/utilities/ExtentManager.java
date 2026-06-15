package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports getReport() {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/ExtentReport.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);

        extent.setSystemInfo("Project", "Guru99 Banking Automation");
        extent.setSystemInfo("Tester", "Vandana Bathini");

        return extent;
    }
}