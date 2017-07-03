package home;

import ExtentReport.ApplicationLog;
import base.CommonAPI;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import search.SearchVerifyPage;
import search.ShopCartPage;

import java.io.IOException;
import java.util.List;

/**
 * Created by salah on 5/27/17.
 */
public class ShoppingCart extends CommonAPI {

    @Test
    public void testShoppingCart()throws IOException, InterruptedException {
        ApplicationLog.epicLogger("Epic: Search EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        ShopCartPage shopCartPage = PageFactory.initElements(driver, ShopCartPage.class);
        SearchVerifyPage searchPage = PageFactory.initElements(driver, SearchVerifyPage.class);

        searchPage.clearSearchInput();
        searchPage.searchFor("java");
        shopCartPage.clickOnFirstResult();
        shopCartPage.addItemToCart();

        searchPage.clearSearchInput();
        searchPage.searchFor("iphone 7");
        shopCartPage.clickOnFirstResult();
        shopCartPage.addItemToCart();

        searchPage.clearSearchInput();
        searchPage.searchFor("camera");
        shopCartPage.clickOnFirstResult();
        shopCartPage.addItemToCart();

        sleepFor(2);
        shopCartPage.clickOnShoppingCart();


        List<WebElement> totalLabel = driver.findElements(By.xpath(".//*[@id='gutterCartViewForm']/div[3]/div[2]/div/div[1]/p/span/span[1]"));
        System.out.println(totalLabel.get(0).getText());

    }
}
