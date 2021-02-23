package Anotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class beforesuite {
    @BeforeSuite
    public void beforesuitemethod()
    {
        System.out.println("i am before suite");
    }

    @AfterSuite
    public void aftersuite()
    {
        System.out.println("i am after suite");
    }
}
