package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionexmaple {


    @Test
    public void test(){
        System.out.println("i am here for assertion example");
        Assert.assertEquals("facebook","facebook");
        System.out.println("here sting is not matched");
    }
    @Test
    public void test2 (){
        System.out.println("i am here for  different assertion example");
        Assert.assertEquals(400,200);
    }
    @Test
    public void test3(){
        System.out.println("i am here without assertion example");
        Assert.assertFalse(false,"i want to fail");
    }
    @Test
    public void test4(){
        System.out.println("i am here for assertion example with may be igation condition");
    }
    @Test
    public void test5(){
        System.out.println("i am here for assertion example ad i  am last");
    }

}
