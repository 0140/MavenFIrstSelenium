package com.cybertek.tests.day14;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage= new LoginPage();


    @Test
    public void loginTest1(){
        String usernmae= ConfigurationReader.getProperty("username");
        String password=ConfigurationReader.getProperty("password");
        loginPage.login(usernmae,password);
    }
}
