package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class DashBoardPage extends Utility {
    By dashboardText=By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public String getDashboardText(){
        return getTextFromElement(dashboardText);
    }

}
