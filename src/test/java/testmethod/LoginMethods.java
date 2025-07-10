package testmethod;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;

public class LoginMethods {
    private static final Logger log = LoggerFactory.getLogger(LoginMethods.class);
//    LoginPage loginPage;
//    WebDriver driver;
//
//    public LoginMethods(WebDriver driver){
//        this.driver = driver;
        LoginPage loginPage = new LoginPage();


    public void loginprocess(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickOnSubmitButton();

    }
}
