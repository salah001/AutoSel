package search;

import ExtentReport.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by salah on 5/28/17.
 */
public class logInPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#nav-link-accountList")
    public static WebElement logInput;

    @FindBy(how = How.CSS, using = "#ap_email")
    public static WebElement logInputEmail;

    @FindBy(how = How.CSS, using = "#ap_password")
    public static WebElement logInputPass;

    @FindBy(how = How.CSS, using = "#signInSubmit")
    public static WebElement logSubmit;

    public static WebElement getLogInput() {
        return logInput;
    }

    public static WebElement getLogInputEmail() { return logInputEmail; }

    public static WebElement getLogInputPass() { return logInputPass; }

    public static WebElement getLogSubmit() { return logSubmit; }


    public void clickOnloginSection() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLogInput().click();
    }

    public void enterEmail() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLogInputEmail().sendKeys("salahcontactnow@hotmail.com");
    }

    public void enterPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLogInputPass().sendKeys("salah3awtani");
    }

    public void clickOnsubmit() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLogSubmit().click();
    }

}
