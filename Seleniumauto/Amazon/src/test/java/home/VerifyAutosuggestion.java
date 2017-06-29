package home;

import ExtentReport.ApplicationLog;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.AutoSuggestion;
import search.SearchPage;

import java.io.IOException;
import java.util.List;

/**
 * Created by salah on 5/27/17.
 */
public class VerifyAutosuggestion extends CommonAPI {

    @Test
    public void verifySuggestion() throws IOException, InterruptedException {
        ApplicationLog.epicLogger("Epic: Search EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        AutoSuggestion autoSuggestion = PageFactory.initElements(driver, AutoSuggestion.class);

        //clear input search
        autoSuggestion.clearSearchInput();
        //type "java"
        autoSuggestion.typeInSearch("java");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id='suggestions']/div/span"));

        for (int i = 0; i < allOptions.size(); i++) {
            String option = allOptions.get(i).getText();
            System.out.println(option);
            System.out.println(i);

        }
    }
}
