package listner;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class samplelistenners {

    @Test
    public void testone() {
        System.out.println("i am the first");
    }

    @Test(dataProvider = "dataprovider")
    public void getdata(String  s) {
        System.out.println("test data method,input" + s);
    }

    @DataProvider
    public Object[] dataprovider() {
        return new Object[]{"A", "B"};
    }

    @Test
    public void test3() {
        Assert.assertEquals(5, 8);
    }

    @Test
    public void test4() {
        System.out.println("i am test 4");
        throw  new SkipException(null);
    }
}
