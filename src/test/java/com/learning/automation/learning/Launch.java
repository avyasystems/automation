package com.learning.automation.learning;

import com.learning.automation.petstore.common.BasePage;
import com.learning.automation.petstore.pages.FindOwners;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class Launch extends BasePage {

    @Autowired
    FindOwners findOwners;

    @Test
    public void testLaunch()
    {
        launch("test1");

        //findOwners.searchOwner("test1");
    }

    //@Test
    public void testLaunch1()
    {
        launch("test2");
        //findOwners.searchOwner("test2");
    }
}
