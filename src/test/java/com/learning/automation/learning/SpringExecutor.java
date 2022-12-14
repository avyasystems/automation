package com.learning.automation.learning;


import com.learning.automation.petstore.common.BasePage;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileInputStream;
import java.util.Properties;

public class SpringExecutor extends BasePage {

    @Value("${app.db.username}")
    public String dbUserName;

    //@Test
    public void execute()
    {
        System.out.println("UserName Value "+dbUserName);
    }

    //@Test
    public void readProperties()
    {
        try
        {
            FileInputStream file = new FileInputStream("src//main//java//resources//credentials.properties");
            Properties properties = new Properties();
            properties.load(file);
            System.out.println("Url property value: "+properties.getProperty("app1.url"));
            System.out.println("Username property value: "+properties.getProperty("app1.db.password"));
        }
        catch (Exception e){}

    }

    public void lofin()
    {
        //webdriber.sendkeys("username",roperties.getProperty("app1.url"));
        //webdriver.sendkeys("password","password123");
    }
}
