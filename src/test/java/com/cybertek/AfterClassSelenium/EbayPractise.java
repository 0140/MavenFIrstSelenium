package com.cybertek.AfterClassSelenium;

import com.cybertek.SeleniumUtils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EbayPractise {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("java Book", Keys.ENTER);
     String a= driver.findElement(By.className("srp-controls__count-heading")).getText();
        System.out.println(a);
        driver.quit();
    }
}