package Util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportUtil {
    private static ExtentReports extent;
    private static ExtentTest test;
    private static ExtentSparkReporter spark;

    public static void intiReport() {
        String Date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String reportPath = "src/testoutput/reports/extendreport_" + Date + ".html";

        spark = new ExtentSparkReporter(reportPath);
        spark.config().setReportName("Test Result");
        spark.config().setDocumentTitle("extent report - Automation result");

        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "krishna");

    }
    public static ExtentReports getExtent() {
        return extent;
    }

    public static ExtentTest createTest(String testName) {
        test = extent.createTest(testName);
        return test;
    }

    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }

    public static ExtentTest getTest() {
        return test;
    }
}

