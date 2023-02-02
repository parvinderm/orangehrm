package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class ViewSystemUserPage extends Utility {
    By systemUsersText = By.className("oxd-text oxd-text--h5 oxd-table-filter-title");
    public String getSystemUsersText(){
        return getTextFromElement(systemUsersText);
    }
    By usernameField = By.className("oxd-input oxd-input--active");
    public void clickOnUsernameField(String username){
        sendTextToElement(usernameField,username);

    }
    By userRoleDropdown= By.className("oxd-select-text--afte");
    public void selectUserRoleDropdown(String text){
        Reporter.log("select from user role dropdown"+userRoleDropdown.toString());
       selectByContainsTextFromDropDown(userRoleDropdown,text);

    }
    By employeeNameField =By.className("oxd-select-text--after");
    public void enterOnEmployeeNameField(String name){
        Reporter.log("click on Employee name field"+employeeNameField.toString());
        sendTextToElement(employeeNameField,name);
    }
    By statusDropDown= By.className("oxd-icon bi-caret-down-fill oxd-select-text--arrow");
    public void clickOnStatusDropdown(String name){
        Reporter.log("click on status dropdown"+statusDropDown.toString());
        sendTextToElement(statusDropDown,name);
    }
    By searchButton = By.className("oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space");
    public void clickOnSearchButton(){
        Reporter.log("click on Search Button"+searchButton.toString());
        clickOnElement(searchButton);
    }
    By resetButton=By.className("oxd-button oxd-button--medium oxd-button--ghost");
    public void clickOnResetButton(){
        Reporter.log("click on Reset Button"+resetButton.toString());
        clickOnElement(resetButton);
    }
    By addButton = By.className("oxd-button oxd-button--medium oxd-button--secondary");
    public void clickOnAddButton(){
        Reporter.log("click on Add Button"+addButton.toString());
        clickOnElement(addButton);
    }
    By deleteButton = By.className("oxd-icon bi-trash");
    public void clickOnDeleteButton(){
        Reporter.log("click on delete button"+deleteButton.toString());
        clickOnElement(deleteButton);

    }
    By errorCannotBeDeleted=By.className("oxd-sidepanel-body");
    public String getErrorMessage(){
        return getTextFromElement(errorCannotBeDeleted);
    }
    By noRecordsFound= By.className("oxd-text oxd-text--span");
    public String getNoRecordsFound(){
        return getTextFromElement(noRecordsFound);
    }
}
