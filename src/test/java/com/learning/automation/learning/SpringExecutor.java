package com.learning.automation.learning;


import com.learning.automation.BasePage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.testng.annotations.Test;

public class SpringExecutor extends BasePage {

    @Value("${app.db.username}")
    public String dbUserName;

    @Test
    public void execute()
    {
        System.out.println("UserName Value "+dbUserName);
    }
}
