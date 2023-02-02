package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends Utility {

    By usernameField =By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By loginPanelText=  By.className("oxd-text oxd-text--h5 orangehrm-login-title");

    public void enterUsernameOnUsernameField(String username){
        sendTextToElement(usernameField,username);

    }
    public void enterPasswordOnPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getLoginPanelText(){
        return getTextFromElement(loginPanelText);
    }
    By logout = By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]/a");
    public void mouseHoverDemo(){
        Actions actions = new Actions(driver);
        WebElement paulCollings = driver.findElement(By.className("oxd-userdropdown-name"));
        WebElement logout = driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]/a"));
        actions.moveToElement(paulCollings).moveToElement(logout).click().build().perform();
    }

}
