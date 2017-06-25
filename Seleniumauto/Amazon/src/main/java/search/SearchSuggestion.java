package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by salah on 6/20/17.
 */
public class SearchSuggestion extends CommonAPI {

    @FindBy(how = How.CSS, using = "#issDiv0")
    public static WebElement firstSuggestion;

    public static WebElement getFirstSuggestion() {
        return firstSuggestion;
    }
}
