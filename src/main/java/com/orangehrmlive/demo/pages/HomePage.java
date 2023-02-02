package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    By storeOrangeHrmLogo=By.xpath("client brand banner");
    By adminTab =By.linkText("Admin");
    By PIMTab =By.xpath("//div[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
    By leaveTab= By.className("oxd-main-menu-item-wrapper");
    By dashboardText=By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    By addButton = By.className("oxd-button oxd-button--medium oxd-button--secondary");
    public String getStoreOrangeHrmLogo(){
        return getTextFromElement(storeOrangeHrmLogo);

    }
    public void clickOnAdminTab(){
        Reporter.log("click on Admin tab"+adminTab.toString());
        clickOnElement(adminTab);
    }
    public void clickOnPimTab(){
        Reporter.log("click on PIM tab "+PIMTab.toString());
        clickOnElement(PIMTab);
    }
    public void clickOnLeaveTab(){
        Reporter.log("click on Leave Tab"+leaveTab.toString());
        clickOnElement(leaveTab);
    }
    public String getDashboardText(){
        return getTextFromElement(dashboardText);
    }
    public void clickOnAddButton(){
        Reporter.log("click on Add Button"+addButton.toString());
        clickOnElement(addButton);
    }
    By addText = By.className("oxd-button oxd-button--medium oxd-button--secondary");
     public String getAddText(){
       return getTextFromElement(addText);
    }
    By userProfileLogo =By.className("oxd-userdropdown-img");
     public void clickOnUserProfileLogo(){
         Reporter.log("click on user profile logo"+userProfileLogo.toString());
         clickOnElement(userProfileLogo);
     }






}
