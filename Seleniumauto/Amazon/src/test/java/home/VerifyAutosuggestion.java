package home;

import ExtentReport.ApplicationLog;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.SearchPage;
import search.SearchSuggestion;

import java.io.IOException;

/**
 * Created by salah on 5/27/17.
 */
public class VerifyAutosuggestion extends CommonAPI {

    @Test
    public void verifySuggestion() throws IOException, InterruptedException {
        ApplicationLog.epicLogger("Epic: Search EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        SearchSuggestion searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);

        //clear input search
        searchPage.clearSearchInput();
        //type "l"
        searchPage.searchFor("l");
        //see if there are any suggestion in the submenu click on the first one
        searchSuggestion.getFirstSuggestion();
    }
}
