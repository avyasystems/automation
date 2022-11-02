package com.learning.automation.learning;


import com.learning.automation.learning.variables.DeclareVariables;
import org.testng.annotations.Test;

import static com.learning.automation.learning.variables.DeclareVariables.staticVariable;

public class Variables {

    //@Test
    public void run()
    {
        System.out.println(staticVariable);
        DeclareVariables declareVariables = new DeclareVariables();
        declareVariables.method1();
        declareVariables.method2();
    }

}
