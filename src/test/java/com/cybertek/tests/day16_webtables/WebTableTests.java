package com.cybertek.tests.day16_webtables;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTableTests extends TestBase {

    @Test
    public void printTableTest(){
        WebElement table = driver.findElement(By.id("table1"));
        System.out.println(table.getText());
    }

    @Test
    public void printHeaderRow(){
        WebElement header = driver.findElement(By.id("table1")).findElement(By.tagName("thead"));
        System.out.println(header.getText());
    }

}