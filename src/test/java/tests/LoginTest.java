package tests;

import Util.LoggerUtil;
import base.Base;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import testmethod.LoginMethods;

public class LoginTest extends Base {
    public Logger log = LoggerUtil.getLogger(this.getClass());
    @Test
    public void LogintestCase() throws InterruptedException {
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.loginprocess("admin","admin123");
        log.info("Successfully Login");

    }





}
