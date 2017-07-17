package com.google_keep.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Logger;

public class main_functions {
    private static final Logger LOGGER = Logger.getLogger(main_functions.class.getName());
    public static WebDriver driver = getDriver();

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromeForMac/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public static void launchUrl() {
        driver.navigate().to("https://keep.google.com");
    }

    public static void closeDriver() {
         getDriver().quit();
         driver = null;
         LOGGER.info("Closing the current browser driver");
        }

}

