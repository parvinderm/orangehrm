package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends TestBase {
    LoginPage loginPage = new LoginPage();
       HomePage homePage = new HomePage();
     ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();
      AddUserPage addUserPage=new AddUserPage();
     @Test
     public void adminShouldAddUserSuccessfully() {

        loginPage.enterUsernameOnUsernameField("Admin");
        loginPage.enterPasswordOnPasswordField("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdminTab();
        String actualMessage = viewSystemUserPage.getSystemUsersText();
        String expectedMessage = "System Users";
        Assert.assertEquals(actualMessage, expectedMessage, "System Users Text Are Verified");
        homePage.clickOnAddButton();
        String actualMessage1= homePage.getAddText();
        String expectedMessage1 = "Add";
        Assert.assertEquals(actualMessage1,expectedMessage1,"Add Button is verified");
        addUserPage.selectUserRoleDropdownLink("Admin");
        addUserPage.enterEmployeeName("Aaliyah Haq");
        addUserPage.enterUsernameOnUsernameField("Admin");
        addUserPage.selectFromStatusDropdown("Enabled");
        addUserPage.enterPasswordInPasswordField("Jignesh66@");
        addUserPage.enterConfirmPassword("Jignesh66@");
        addUserPage.clickOnSaveButton();
     }
     @Test
    public void searchTheUserCreatedAndVerifyIt(){
         loginPage.clickOnLoginButton();
         homePage.clickOnAdminTab();
        String actualText= viewSystemUserPage.getSystemUsersText();
        String expectedText="System Users";
        Assert.assertEquals(actualText,expectedText,"System Users Text Verified");
        viewSystemUserPage.clickOnUsernameField("Admin");
        viewSystemUserPage.clickOnStatusDropdown("Enabled");
        viewSystemUserPage.clickOnSearchButton();
     }
     @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
         //click on login button
       loginPage.clickOnLoginButton();
       //click on admin tab
       homePage.clickOnAdminTab();
       //verify system users text
       String actualText6 = viewSystemUserPage.getSystemUsersText();
       String expectedText6 = "System Users";
       Assert.assertEquals(actualText6,expectedText6,"System Users Text is verified");
       //enter usernam
       loginPage.enterUsernameOnUsernameField("Admin");
       //select from dropdown
       addUserPage.selectUserRoleDropdownLink("Admin");
       //select status from dropdown
       addUserPage.selectFromStatusDropdown("Enabled");
       //click on search button
       viewSystemUserPage.clickOnSearchButton();
       //verify result list
       String actualText7 = addUserPage.getResultList();
       String expectedText7 = "Result List Admin";
       Assert.assertEquals(actualText7,expectedText7,"Result list displayed By Admin Username");
       //click on delete button
       viewSystemUserPage.clickOnDeleteButton();
       //sorry bhavesh but there was no popup displayed ,so i verified by "error cannot be deleted" message
         //verify error cannot be deleted
       String actualText8 = viewSystemUserPage.getErrorMessage();
       String expectedText8 = "Error Cannot Be Deleted";
       Assert.assertEquals(actualText8,expectedText8,"Verified the text");
       //Sorry But there is no popup button so couldn't able to verify successfully deleted message
     }
     @Test
     public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
         //click on login button
         loginPage.clickOnLoginButton();
         //click on admin tab
         homePage.clickOnAdminTab();
         //Verify System users text
         String actualText9= viewSystemUserPage.getSystemUsersText();
         String expectedText9="System Users";
         Assert.assertEquals(actualText9,expectedText9,"System Users Text Verified");
         //Verify No records found text
         String actualText10= viewSystemUserPage.getNoRecordsFound();
         String expectedText10="No Records Found";
         Assert.assertEquals(actualText10,expectedText10,"Verified No Records Found Text");




     }



}
