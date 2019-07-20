package com.cybertek.day4;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver ().setup ();
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.get ("http://qa2.vytrack.com/user/login");


        Thread.sleep (3999);

        WebElement username = driver.findElement (By.id ("prependedInput"));
        username.sendKeys ("storemanager85");
        WebElement password = driver.findElement (By.id ("prependedInput2"));
        password.sendKeys ("UserUser123");
        WebElement submitButton = driver.findElement (By.name ("_submit"));
        submitButton.click ();
        Thread.sleep (5000);
        WebElement submitButton2 = driver.findElement (By.className ("dropdown-toggle"));
        submitButton2.click ();
        Thread.sleep (3000);
        WebElement logutcsname = driver.findElement (By.xpath("//a[contains(text(), 'Logout')]"));
        logutcsname.click ();


        Thread.sleep (4000);
        String currenturl = driver.getCurrentUrl ();
        String actual = "http://qa2.vytrack.com/user/login";

        if (currenturl.equals (actual)) {
            System.out.println ("passed");
        } else {

            System.out.println ("failed");
            System.out.println ("try again");

        }

        Thread.sleep (4000);

    }
}

