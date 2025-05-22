package listeners;

import Util.LoggerUtil;
import Util.ReportUtil;
import Util.ScreenshotUtil;
import Util.WebDriverUtil;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListeners implements ITestListener {
    Logger log;
    @Override
    public void onTestStart(ITestResult result){
        log = LoggerUtil.getLogger(result.getTestClass().getRealClass());
        log.info("Test Started{}", result.getName());
        ReportUtil.createTest(result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        log.info("Test case passed{}", result.getName());
        WebDriver driver = WebDriverUtil.getDriver();
        String screenshotPath = null;
        try {
            screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ReportUtil.getTest().log(Status.PASS, "Test Passed ✅");
        ReportUtil.getTest().addScreenCaptureFromPath(screenshotPath);

    }
    @Override
    public void onTestFailure(ITestResult result) {

        log.error(" Test Failed: {}", result.getName());
        log.error("Reason: {}", result.getThrowable());
        if (result.getMethod().getRetryAnalyzer(result) == null) {
            result.getMethod().setRetryAnalyzerClass(listeners.RetryAnalyzer.class);
        }
        WebDriver driver = WebDriverUtil.getDriver();
        String screenshotPath = null;
        try {
            screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ReportUtil.getTest().log(Status.FAIL, "Test Failed");
        ReportUtil.getTest().log(Status.FAIL, result.getThrowable());
        ReportUtil.getTest().addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.warn("Test Skipped: {}", result.getName());

        ReportUtil.getTest().log(Status.SKIP, "Test Skipped ");
    }

    // Called before the test suite starts
    @Override
    public void onStart(ITestContext context) {
        log = LoggerUtil.getLogger(TestListeners.class);
        log.info("Test Suite Started: {}", context.getName());
        ReportUtil.intiReport();
    }

    // Called after the test suite ends
    @Override
    public void onFinish(ITestContext context) {
        log.info("Test Suite Finished: {}", context.getName());
        ReportUtil.flushReport();
    }
}

