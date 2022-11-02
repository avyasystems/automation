package com.learning.automation.petstore.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest
public class NewBasePage extends AbstractTestNGSpringContextTests {

    ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<WebDriver>();

    public WebDriver getDriver()
    {
        return webDriverThreadLocal.get();
    }

    public void setDriver()
    {
        WebDriverManager.chromedriver().setup();
        webDriverThreadLocal.set(new ChromeDriver());
    }

    public void openApplication()
    {
        setDriver();
        getDriver().navigate().to("http://localhost:8080/");
        getDriver().manage().window().maximize();
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e){}

    }

}
