package paramertization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {

    @Test(dataProvider = "doubleset")
    public void adddata(int act,int exp)
    {
        //int actualvalue=act+34;
        System.out.println(act);
        System.out.println(exp);
    }

@DataProvider
    public Object[][] getdata() {
    return new Object[][]{
            {123, 23}, {45, 67}, {56, 78}, {67, 89}};
}

    @DataProvider(name="doubleset")
    public Object[][] getdata2() {
        return new Object[][]{
                {123, 2763}, {4578, 6787}, };
    }
}

