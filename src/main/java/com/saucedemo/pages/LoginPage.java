package com.saucedemo.pages;

import com.saucedemo.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utilities {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement logIn;

    public void enterUsername(String username1){
      sendTextToElement(username ,username1);

    }
    public void enterPassword(String password1){
        sendTextToElement(password , password1);
    }

    public void loginButton(){
        clickOnElement(logIn);
    }
}