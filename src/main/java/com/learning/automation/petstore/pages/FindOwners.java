package com.learning.automation.petstore.pages;

import com.learning.automation.petstore.common.NewBasePage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class FindOwners extends NewBasePage {

    public static final By FINDOWNERSTAB = By.xpath("//a[@title='find owners']");
    public static final By FINDOWNERSSEARCHFIELD = By.id("lastName");


    public void searchOwner(String searchText)
    {
        try
        {
            openApplication();
            Thread.sleep(1000);
            getDriver().findElement(FINDOWNERSTAB).click();
            Thread.sleep(1000);
            getDriver().findElement(FINDOWNERSSEARCHFIELD).sendKeys(searchText);
        }
        catch (Exception e){}


    }

}
