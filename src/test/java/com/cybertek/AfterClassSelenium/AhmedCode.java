package com.cybertek.AfterClassSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cybertek.utilities.BrowserFactory;

import java.util.concurrent.TimeUnit;
public class AhmedCode {




        public static void main(String[] args) {

            WebDriver driver= BrowserFactory.getDriver("chrome");

            String URL="http://qa2.vytrack.com/user/login";

            String[][][] user = { { {"user45","user46","user47"},
                    {"UserUser123","UserUser123","UserUser123"}},
                    { {"storemanager81","storemanager82","storemanager83"},
                            {"UserUser123","UserUser123","UserUser123"}},
                    { {"salesmanager146","salesmanager147","salesmanager148"},
                            {"UserUser123","UserUser123","UserUser123"}} };

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(URL);

            for (String[][] each:user) {
                for (int i = 0; i <= 2; i++) {
                    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
                    driver.findElement(By.id("prependedInput")).clear();
                    driver.findElement(By.id("prependedInput")).sendKeys(each[0][i]);
                  //  BrowserFactory.(1);
                    driver.findElement(By.id("prependedInput2")).clear();
                    driver.findElement(By.id("prependedInput2")).sendKeys(each[1][i]);
                 //   BrowserFactory.(1);
                    driver.findElement(By.id("_submit")).click();
                   // BrowserFactory.(3);
                    String s = driver.getTitle();
                    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
                    WebElement logoutMenu=driver.findElement(By.xpath("//*[@id=\"user-menu\"]/a"));
                    if (logoutMenu.isDisplayed()) {
                        System.out.println(each[0][i] + " Login | Pass");
                        logoutMenu.click();
                       // BrowserFactory.waitXseconds(1);
                        driver.findElement(By.xpath("//*[@id=\"user-menu\"]/ul/li[4]/a")).click();
                      //  BrowserFactory.waitXseconds(2);
                        if (driver.findElement(By.id("_submit")).isEnabled())
                            System.out.println(each[0][i] + " Logout | Pass");
                        else System.out.println(each[0][i] + " Logout | Fail");
                    } else {
                        System.out.println(each[0][i] + " Login | Fail");
                    }

                }
            }
            driver.close();
            driver.quit();

        }
    }
