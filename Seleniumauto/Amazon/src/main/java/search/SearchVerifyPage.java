package search;

import ExtentReport.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

/**
 * Created by salah on 5/28/17.
 */
public class SearchVerifyPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement searchSubmit;

    public void searchFor(String item) {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()+": " + item));
        searchInput.sendKeys(item, Keys.ENTER);
    }

    public void clearSearchInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInput.clear();
    }

    public  void verifySearchFor(String item){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()+": " + item));
        List<WebElement> suggestionName = driver.findElements(By.cssSelector(".s-inline.s-access-title.a-text-normal"));//".a-size-medium.s-inline.s-access-title.a-text-normal"));
        String sentence = suggestionName.get(0).getText();
        System.out.println("sentence=\"" + sentence + "\"");
        String[] words = sentence.split("\\s");
        //remove punctuation from sentence
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }

        boolean match ;
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            if (words[i].equals(item)) {
                System.out.println("search match");
                break;
            }else if (i == words.length-1){
                match = false;
                System.out.println("SEARCH DOESN'T MATCH");
                Assert.assertTrue(match);
            }
        }
    }

    public void getDataFromExcelFileAndSearch()throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //Create instance of Excel file reader class
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        //Page Factory class init
        SearchVerifyPage search = PageFactory.initElements(driver, SearchVerifyPage.class);
        //Read data from Excel File.
        String[] value = itemsToBeSearched.getDataFromExcelFile();
        //Running for each loop
        for (int i = 1; i < value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            search.verifySearchFor(value[i]);
            search.clearSearchInput();
        }
    }
}
