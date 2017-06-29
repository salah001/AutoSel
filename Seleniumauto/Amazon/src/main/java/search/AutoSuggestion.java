package search;

import ExtentReport.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by salah on 6/28/17.
 */
public class AutoSuggestion extends CommonAPI{


    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement suggestions;


    public static WebElement getSearchInput() {
        return searchInput;
    }

    public static WebElement getSuggestions() {
        return suggestions;
    }

    public void clearSearchInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInput.clear();
    }

    public void typeInSearch(String item) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()+": " + item));
        searchInput.sendKeys(item);
    }
}
