package com.github.AgnieszkaStelmasik.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AgnieszkaStelmasik on 28.04.2018.
 */
public class LoginPage {
    private WebDriver driver;
    private static final By LOGIN = By.id("ap_email");
    private static final By PASSWORD = By.id("ap_password");
    private static final By LOG_IN_BUTTON = By.id("signInSubmit");



    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public AfterLoginPage LogIn(String Login, String Password){
        driver.findElement(LOGIN).sendKeys(Login);
        driver.findElement(PASSWORD).sendKeys(Password);
        driver.findElement(LOG_IN_BUTTON).click();
        return new SendingMail(driver);

    }
}
