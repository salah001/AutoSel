package search;

import ExtentReport.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by salah on 6/29/17.
 */
public class ShopCartPage extends CommonAPI {

    @FindBy(how =How.CSS, using = "#nav-cart")
    public static WebElement ShopCart ;

    @FindBy(how = How.CSS, using = ".s-access-image.cfMarker")
    public static WebElement firstResult;

    @FindBy(how = How.CSS, using = "#add-to-cart-button")
    public static WebElement addItem;

    public static WebElement getShopCart() {
        return ShopCart;
    }

    public static WebElement getFirstResult() {
        return firstResult;
    }


    public void clickOnFirstResult(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getFirstResult().click();

    }

    public void clickOnShoppingCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getShopCart().click();
    }

    public void addItemToCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        addItem.click();

    }


}
