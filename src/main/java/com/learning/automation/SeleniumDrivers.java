package com.learning.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

import java.sql.Driver;

@Component
public class SeleniumDrivers {
    WebDriver webDriver;
    public void driver(){
        //System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.cricbuzz.com/");
        //webDriver.findElement(By.id("cricbuzz-plus-main-menu")).click();
        //Driver.forward("https://unt.instructure.com/login/ldap");
        webDriver.navigate().forward();
        webDriver.findElement(By.id("pseudonym_session_unique_id")).click();
        webDriver.findElement(By.id("pseudonym_session_password")).click();




    }

}
