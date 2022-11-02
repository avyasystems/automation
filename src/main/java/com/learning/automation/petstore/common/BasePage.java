package com.learning.automation.petstore.common;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest
public class BasePage extends AbstractTestNGSpringContextTests {

    WebDriver webDriver = null;
    public static final By FINDOWNERSTAB = By.xpath("//a[@title='find owners']");
    public static final By FINDOWNERSSEARCHFIELD = By.id("lastName");

    //Launching Chrome browser
    public void launch(String searchText)
    {
        try
        {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
            webDriver.navigate().to("http://www.localhost:8080/");
            webDriver.manage().window().maximize();
            Thread.sleep(1000);
            System.out.println(webDriver.getCurrentUrl());
            webDriver.close();
            webDriver.quit();
            /*webDriver.findElement(FINDOWNERSTAB).click();
            Thread.sleep(1000);*/
            //webDriver.findElement(FINDOWNERSSEARCHFIELD).sendKeys(searchText);
        }
        catch (Exception e){}
    }


}