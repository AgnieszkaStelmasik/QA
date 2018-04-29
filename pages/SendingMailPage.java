package com.github.AgnieszkaStelmasik.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by AgnieszkaStelmasik on 28.04.2018.
 */
 
public class SendingMailPage {
    private WebDriver driver;
	private static final By COMPOSE_BUTTON = By.id("ComposeSubmit");
    private static final By TO = By.id("ap_email");
    private static final By SUBJECT = By.id("ap_text");
    private static final By SEND_BUTTON = By.id("SendSubmit");
    }


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public AfterLoginPage LogIn(String Login, String Password){
		driver.findElement(COMPOSE_BUTTON).click();
        driver.findElement(TO).sendKeys(Email);
        driver.findElement(SUBJECT).sendKeys(Text);
        driver.findElement(SEND_BUTTON).click();
        return new LoginPage(driver);

    }
}