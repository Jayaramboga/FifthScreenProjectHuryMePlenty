package com.epamService.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReadPage {
    public static String readProperty(String key) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Jayaram_Boga\\IdeaProjects\\sa\\FinalProjectHurtyMePlenty\\src\\test\\resources\\qa.properties");
       // Properties properties;
        Properties properties= new Properties();
        properties.load(fileReader);
        return properties.getProperty(key);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(PropertyReadPage.readProperty("testingdata.value.NumberOfInstancesFiled"));
    }
}

