package base;

import Util.WebDriverUtil;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public abstract class BasePage {

    protected WebDriver driver;
    //@Parameters("browser")
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) {
        driver = DriverManager.getDriver(browser);
        WebDriverUtil.setDriver(driver);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterSuite
    public void tearDown() {
        DriverManager.quitDriver();
        WebDriverUtil.removeDriver();
    }
}
