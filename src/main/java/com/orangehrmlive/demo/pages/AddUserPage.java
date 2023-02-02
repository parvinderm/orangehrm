package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AddUserPage extends Utility {
    By userRoleDropDown = By.className("oxd-icon bi-caret-down-fill oxd-select-text--arrow");

    public void selectUserRoleDropdownLink(String text){
        Reporter.log("click on User Role Drop Down"+userRoleDropDown.toString());
        selectByVisibleTextFromDropDown(userRoleDropDown,text);
    }
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    public void enterEmployeeName(String name){
        Reporter.log("click on Employee Name DropDown"+employeeName.toString());
        sendTextToElement(employeeName,name);
    }
    By usernameField = By.className("oxd-input oxd-input--active");
    public void enterUsernameOnUsernameField(String username){
        sendTextToElement(usernameField,username);
    }
    By status = By.className("oxd-icon bi-caret-down-fill oxd-select-text--arrow");
    public void selectFromStatusDropdown(String text){
        selectByVisibleTextFromDropDown(status,text);

    }
    By passwordField = By.className("oxd-input oxd-input--active");
    public void enterPasswordInPasswordField(String password){
        Reporter.log("enter password"+passwordField.toString());
        sendTextToElement(passwordField,password);
    }
    By confirmPassword = By.className("oxd-input oxd-input--active");
    public void enterConfirmPassword(String password){
        Reporter.log("enter confirm password"+confirmPassword.toString());
        sendTextToElement(passwordField,password);
    }
    By saveButton= By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public void clickOnSaveButton(){
        Reporter.log("click on save button "+saveButton.toString());
        clickOnElement(saveButton);
    }
    By cancelButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public void clickOnCancelButton(){
        Reporter.log("click on cancel button"+cancelButton.toString());
        clickOnElement(cancelButton);
    }
    By resultListAdmin=By.className("oxd-table-cell oxd-padding-cell");
    public String getResultList(){
        return getTextFromElement(resultListAdmin);
    }

}
