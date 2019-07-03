package com.cybertek.OfficeHours;

import com.cybertek.SeleniumUtils.BrowserFactory;
import com.cybertek.SeleniumUtils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ExpediaTest<pubil> {


    static WebDriver driver= BrowserFactory.getDriver("chrome");

    public static void main(String [] args){

openHomePage();
flightTicket1();
    }

    public static void openHomePage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.expedia.com");
        String expectedTitle="Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations";
        String actualTitle=driver.getTitle();
        SeleniumUtils.verifyEquals(expectedTitle,actualTitle);

    }

    public static void flightTicket1(){
        driver.findElement(By.id("light-origin-hp-flight"));


    }

}
