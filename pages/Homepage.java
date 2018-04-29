package com.github.AgnieszkaStelmasik.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


import java.sql.Driver;

/**
 * Created by AgnieszkaStelmasik on 28.04.2018.
 */
public class Homepage {
    private static WebDriver driver;
    private final static String LINK  = "https://www.gmail.com";
    private final static By SIGN_IN_BUTTON = By.id("nav-link-accountList");
    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    public Homepage goTo(){
        driver.get(LINK);
        return this;
    }

    public LoginPage GoToLogInPage(){
        driver.findElement(SIGN_IN_BUTTON).click();
        return new LoginPage(driver);
    }

}
