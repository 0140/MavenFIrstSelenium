package com.cybertek.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Test1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // setup web driver
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("jamesbond@box.az");
        driver.findElement(By.id("form_submit")).click();
        assert driver.findElement(By.name("confirmation_message")).getText() == "Your e-mail's been sent!";
        System.out.println(driver.findElement(By.name("confirmation_message")).getText());
        driver.findElement(By.name("form_submit")).sendKeys(Keys.ENTER);
        // driver.close();
       // driver.manage().window().re
        driver.navigate( ).refresh( );
        driver.navigate();
        driver.quit();

    }
}
