package tests;

import Util.LoggerUtil;

import base.BasePage;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import testmethod.LoginMethods;


public class LoginTest extends BasePage {
    public Logger log = LoggerUtil.getLogger(this.getClass());
    LoginMethods loginMethods;
    @Test
    public void LogintestCase() throws InterruptedException {
        loginMethods = new LoginMethods();
        loginMethods.loginprocess("admin","admin123");
        log.info("Successfully Login");

    }





}
