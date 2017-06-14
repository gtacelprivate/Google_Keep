package com.hackerrank.page_objects;
import com.hackerrank.utils.main_functions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static com.hackerrank.utils.main_functions.getDriver;

/**
 * Created by tacelg on 09/06/2017.
 */
public class Homepage extends main_functions {
    private static WebDriverWait wait = new WebDriverWait(driver, 60);
    
    public void verifyLatestNewsDisplayed() {
        WebElement latestNews = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//H2[@class='block-header__heading'][text()='Latest news']")));
        Assert.assertTrue(latestNews.isDisplayed());

    }

    public void navigateToTab(String arg0) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.hamburger__front > i.icons.glyph"))).click();
        List<WebElement> tabs = driver.findElements(By.cssSelector("#navigationMenuWrapper > div > ul > li > a"));
        ArrayList<WebElement> tabsList = new ArrayList<WebElement>();
        for (WebElement tab : tabs) {
            String tabLink =tab.getAttribute("href");
            if(tabLink.contains(arg0)){
                tabsList.add(tab);
            }
        }
        tabsList.get(0).click();
    }
}
