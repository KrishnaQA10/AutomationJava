package Util;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
    private static final Logger log = LoggerUtil.getLogger(ScreenshotUtil.class);
    public static String captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotpath = "src/testoutput/screenshots" + screenshotName + "_" + timestamp + ".png";

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File desFile = new File(screenshotpath);

        try {
            Files.copy(scrFile.toPath(), desFile.toPath());
            log.info("Successfully Saved Screenshot");
        } catch (IOException e) {
            log.error("error while saving the Screenshot{}", e.getMessage());
        }
        return desFile.getAbsolutePath();
    }

}
