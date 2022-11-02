package com.learning.automation.learning;


import com.learning.automation.BasePage;
import com.learning.automation.SeleniumDrivers;
import com.learning.automation.learning.variables.DeclareVariables;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static com.learning.automation.learning.variables.DeclareVariables.staticVariable;

public class Variables extends BasePage {


    @Autowired
    SeleniumDrivers seleniumDrivers;
    @Test
    public void run()
    {
        seleniumDrivers.driver();
    }

}
