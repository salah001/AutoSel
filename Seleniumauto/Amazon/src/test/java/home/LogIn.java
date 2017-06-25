package home;

import ExtentReport.ApplicationLog;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.logInPage;

/**
 * Created by salah on 5/27/17.
 */
public class LogIn extends CommonAPI {

    @Test
    public static void login() {

        ApplicationLog.epicLogger("Epic: News EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-1> GREEN-1 </a>");
        logInPage logPage = PageFactory.initElements(driver, logInPage.class);
        logPage.clickOnloginSection();
        logPage.enterEmail();
        logPage.enterPassword();
        logPage.clickOnsubmit();

    }

}
