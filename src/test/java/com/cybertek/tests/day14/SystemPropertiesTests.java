package com.cybertek.tests.day14;

import org.testng.annotations.Test;

import java.util.Map;
import java.util.Properties;


public class SystemPropertiesTests {

    @Test
    public void systemPropertiesTest1(){

        String os=System.getProperty("os.name");
        System.out.println(os);

        String userName=System.getProperty("user.name");
        System.out.println(userName);

        String javaVersion=System.getProperty("java.version");
        System.out.println(javaVersion);


        String javaSpesification=System.getProperty("java.specification.version");
        System.out.println(javaSpesification);


        String homeDirectory=System.getProperty("user.home");
        System.out.println(homeDirectory);

        Properties properties=System.getProperties();
        for(Map.Entry<Object, Object>property: properties.entrySet()){
            System.out.println("Key: "+property.getKey()+", Value: "+property.getValue());
        }

    }
}
