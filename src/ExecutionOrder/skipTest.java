package ExecutionOrder;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipTest {
  //  @Test(enabled=false)
  @Test(priority =1)
    public void test()
    {
        System.out.println("need to skip the first test");
    }
    @Test
    public void test1()
    {
        System.out.println("need to skip the second test");
    }
    @Test(priority =3)
    public void test2()
    {
        System.out.println("need to skip the third test");
        // throw new SkipException("skipping deliberately beacuse its incomplete");
    }
    @Test(priority =2)
    public void test3()
    {
        System.out.println("need to skip the fourth test");
    }
}
