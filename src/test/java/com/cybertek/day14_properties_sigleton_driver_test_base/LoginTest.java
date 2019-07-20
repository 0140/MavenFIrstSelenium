package com.cybertek.day14_properties_sigleton_driver_test_base;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    LoginPage loginPage= new LoginPage();


    @Test
    public void loginTest1(){
        String usernmae= ConfigurationReader.getProperty("username");
        String password=ConfigurationReader.getProperty("password");
        loginPage.login(usernmae,password);
    }
}
