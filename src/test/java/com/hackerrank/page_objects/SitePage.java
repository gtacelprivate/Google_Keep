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

/**
 * Created by tacelg on 09/06/2017.
 */
public class SitePage extends main_functions {
    private WebDriverWait wait = new WebDriverWait(driver, 60);

    public void assertTitleIsCorrect(String arg0) {
        WebElement h1 =wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        Assert.assertTrue(h1.getText().equals(arg0));
    }

    public void getAmountValtechOffices() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("office__heading")));
        List<WebElement> officeHeadings = driver.findElements(By.className("office__heading"));
        ArrayList<WebElement> offices = new ArrayList<WebElement>();
        for (WebElement officeHeading: officeHeadings) {
            offices.add(officeHeading);
        }
        int amountOffices = offices.size();
        System.out.println(amountOffices);
    }

    public void clickGetValtechOffices() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Valtech Offices"))).click();
    }
}
