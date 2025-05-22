package base;

import Util.ConfigReader;
import Util.LoggerUtil;
import Util.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Base {
    public WebDriver driver; //WebDriver is an interphase and driver is an object
    public Logger log = LoggerUtil.getLogger(this.getClass());

    @BeforeMethod

    public void setup(){
        String browser = ConfigReader.getProperty("browser").trim();
        String URL = ConfigReader.getProperty("url").trim();
        //WebDriverManager.chromedriver().setup();
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(); // class which launch the Chrome browser
        }else if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else {log.error("No Browser found");
        }

        WebDriverUtil.setDriver(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @AfterMethod
    public void tearDown(){
        if(driver!= null){
            driver.quit();
            WebDriverUtil.removeDriver();
        }
    }



}
