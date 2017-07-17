package com.google_keep.page_objects;

import com.google_keep.utils.main_functions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by tacelg on 17/07/2017.
 */
public class Login_Page extends main_functions {
    private WebDriverWait wait = new WebDriverWait(driver, 60);

    public void loginGoogleAccount() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")))
                .sendKeys("testingAutomation22@gmail.com");
        driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//INPUT[@type='password']")));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//INPUT[@type='password']")).sendKeys("testingAutomation222");
        driver.findElement(By.cssSelector("#passwordNext > content > span")).click();
    }
}
