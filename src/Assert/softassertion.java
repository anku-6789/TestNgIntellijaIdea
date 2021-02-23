package Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {

    @Test
    public void testone()
    {
        SoftAssert SoftAssert = new SoftAssert();
        System.out.println("testcase one excution  started");
        SoftAssert.assertEquals(5,5 ,"Firsthard assert failed");
        System.out.println("soft assert sucess");
        SoftAssert.assertTrue("hey".equals("hey"),"secod hard assert failed");
        System.out.println("test case one executed sucessfulyy");
        SoftAssert.assertAll();
    }

    @Test
    public void testtwo()
    {
        SoftAssert SoftAssert = new SoftAssert();
        System.out.println("testcase one excution  started");
        SoftAssert.assertEquals(5,5 ,"Firsthard assert failed");
        System.out.println("soft assert sucess");
        SoftAssert.assertTrue(false,"secod hard assert failed");
        System.out.println("test case one executed sucessfulyy");
        SoftAssert.assertAll();

    }

    @Test
    public void testthree()
    {
        SoftAssert SoftAssert = new SoftAssert();
        System.out.println("testcase one excution  started");
        SoftAssert.assertEquals(5,5 ,"Firsthard assert failed");
        System.out.println("soft assert sucess");
        SoftAssert.assertTrue("hey".equals("hey"),"secod hard assert failed");
        System.out.println("test case one executed sucessfulyy");
        SoftAssert.assertAll();
    }
}
