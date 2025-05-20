package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    By userNameField = By.xpath("//input[@placeholder='Username']");
    By passwordFiled = By.xpath("//input[@placeholder='Password']");
    By submitFiled = By.xpath("//button[normalize-space()='Login']");

    public void enterUserName(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(passwordFiled).sendKeys(password);
    }
    public void clickOnSubmitButton(){
        driver.findElement(submitFiled).click();
    }

}
