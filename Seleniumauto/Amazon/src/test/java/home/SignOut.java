package home;

import ExtentReport.ApplicationLog;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.logInPage;

/**
 * Created by salah on 5/27/17.
 */
public class SignOut extends CommonAPI {

    @Test
    public void logOut() {

        LogIn.login();
        mouseHoverClickByCSS("#nav-link-accountList", "#nav-al-your-account #nav-item-signout .nav-text");
    }
}
