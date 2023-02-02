package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AdminPage extends Utility{

    By userManagementTab = By.xpath("//div[@class='oxd-topbar-body']//nav/ul/li[2]/span");
    public void clickOnUserManagementTab(){
        Reporter.log("click on User Management Tab"+userManagementTab.toString());
        clickOnElement(userManagementTab);
    }
    By jobTab =By.className("oxd-topbar-body-nav-tab-item");
    public void clickOnJobTab(){
        Reporter.log("click on Job Tab"+jobTab.toString());
        clickOnElement(jobTab);

    }
    By organizationTab = By.className("oxd-topbar-body-nav-tab-item");

    public void clickOnOrganizationTab(){
        Reporter.log("click on organization Tab "+organizationTab.toString());
        clickOnElement(organizationTab);

    }
}
