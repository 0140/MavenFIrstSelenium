package com.cybertek.AfterClassSelenium;

import com.cybertek.SeleniumUtils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SybertexPracticeFromScratch {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception {


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/login");
        //    driver.findElement(By.id("woodenspoon")).click();
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();
        driver.findElement(By.linkText("Home")).click();
         driver.findElements(By.className("list-group"));
        List<WebElement> exam=  driver.findElements(By.className("list-group"));
        for(WebElement element: exam){
            System.out.println(element.getText());
        }

    }
}