package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashBoardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
     DashBoardPage dashBoardPage = new DashBoardPage();
     HomePage homePage = new HomePage();
     ViewSystemUserPage viewSystemUserPage=new ViewSystemUserPage();
    @Test
    public void verifyUserShouldLoginSuccessFully(){
        loginPage.enterUsernameOnUsernameField("Admin");
        loginPage.enterPasswordOnPasswordField("admin123");
        loginPage.clickOnLoginButton();
        String actualText3= dashBoardPage.getDashboardText();
        String expectedText3="Dashboard";
        Assert.assertEquals(actualText3,expectedText3,"Verified Dashboard Text");
    }
    @Test
    public void verifyThatTheLogoDisplayOnHomePage(){
        loginPage.clickOnLoginButton();
        String actualText4 =homePage.getStoreOrangeHrmLogo();
        String expectedText4 = "OrangeHRM";
        Assert.assertEquals(actualText4,expectedText4,"Verified OrangeHRM logo");
    }
       @Test
     public void verifyUserShouldLogOutSuccessFully(){
        loginPage.clickOnLoginButton();
        homePage.clickOnUserProfileLogo();
        loginPage.mouseHoverDemo();
        String actualText5=loginPage.getLoginPanelText();
        String expectedText5=loginPage.getLoginPanelText();
        Assert.assertEquals(actualText5,expectedText5,"Login Panel Is Displayed");
        loginPage.enterUsernameOnUsernameField("emily");
        viewSystemUserPage.selectUserRoleDropdown("rit");
        viewSystemUserPage.clickOnStatusDropdown("Enabled");
        viewSystemUserPage.clickOnSearchButton();


       }

}
