package com.learning.automation.petstore;

import com.learning.automation.petstore.common.NewBasePage;
import com.learning.automation.petstore.pages.FindOwners;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class SearchOwner extends NewBasePage {

    @Autowired
    FindOwners findOwners;

    @Test
    public void searchTest1()
    {
        findOwners.searchOwner("test1");
    }

   @Test
    public void searchTest2()
    {
        findOwners.searchOwner("test2");
    }

}
