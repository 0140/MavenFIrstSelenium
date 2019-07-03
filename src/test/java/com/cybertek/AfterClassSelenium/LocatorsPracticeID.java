package com.cybertek.AfterClassSelenium;

import com.cybertek.SeleniumUtils.SeleniumUtils;
import com.cybertek.SeleniumUtils.BrowserFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LocatorsPracticeID {

   static WebDriver driver = BrowserFactory.getDriver( "chrome");

   public static void main (String [] args) throws Exception{

       test1();
       test2();


   }

@Test
   public static void test1() throws Exception{

       driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("http://practice.cybertekschool.com/login");
   //    driver.findElement(By.id("woodenspoon")).click();
       driver.findElement(By.name("username")).sendKeys("tomsmith");
       driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
       driver.findElement(By.id("wooden_spoon")).click();
       driver.findElement(By.linkText("Logout")).click();
       Thread.sleep(3000);
       driver.quit();
   }


@Test
   public static void test2() throws Exception {
       driver.manage().window().maximize();
      // this is you must to use, otherwise you will be in trouble
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("http://practice.cybertekschool.com/login");
       driver.findElement(By.name("username")).sendKeys("tomsmith");
       driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
       driver.findElement(By.id("wooden_spoon")).click();
       Thread.sleep(3000);
       String expectedMessage = "Welcome to the Secure Area. When you are done click logout below.";
       String actualMessage = driver.findElement(By.className("subheader")).getText();
       SeleniumUtils.verifyEquals(expectedMessage, actualMessage);
       driver.findElement(By.linkText("Logout")).click();
       Thread.sleep(3000);
       driver.quit();
   }
   }


