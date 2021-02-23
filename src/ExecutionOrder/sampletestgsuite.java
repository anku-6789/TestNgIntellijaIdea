package ExecutionOrder;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class sampletestgsuite {

    @BeforeSuite
     public void beforesuite()
    {
        System.out.println("guys i am before suite ");
    }

    @AfterSuite
            public void aftersuite()
    {
        System.out.println("guys i am aftere suite ");
    }
}
