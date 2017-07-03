package home;

import ExtentReport.ApplicationLog;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.SearchVerifyPage;

import java.io.IOException;

/**
 * Created by salah on 5/27/17.
 */
public class SearchVerifyItems extends CommonAPI {

    @Test
    public void search() throws IOException, InterruptedException {
        ApplicationLog.epicLogger("Epic: Search EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        SearchVerifyPage searchPage = PageFactory.initElements(driver, SearchVerifyPage.class);
        searchPage.getDataFromExcelFileAndSearch();
    }
}
