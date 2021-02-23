package Depeandacy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class multitest {

@Test
    public void start()
{
    System.out.println("system server is starting");
}
   @Test
    public void init()
    {
        System.out.println("system server is initalizong the variable");
    }


    @Test(dependsOnMethods= "init")
    public void process()
    {
        //Assert.assertTrue(false);
        System.out.println("system server is in progress");
    }

    @Test(dependsOnMethods= {"process", "start"})
    public void stop()
    {
        System.out.println("system server is stoppping now");
    }


}
