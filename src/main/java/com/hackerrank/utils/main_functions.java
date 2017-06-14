package com.hackerrank.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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
        driver.navigate().to("https://www.valtech.com");
    }


     public static void closeDriver() {
         getDriver().quit();
         driver = null;
         LOGGER.info("Closing the current browser driver");
        }

}

