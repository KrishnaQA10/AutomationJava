package tests;

import base.Base;
import org.testng.annotations.Test;
import testmethod.LoginMethods;

public class LoginTest extends Base {
    @Test
    public void LogintestCase() throws InterruptedException {
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.loginprocess("Admin","admin123");
        System.out.println("Successfully Login");

    }





}
