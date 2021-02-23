package paramertization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testparameters {
 @Parameters("browser")
    @Test
    public void one(String browser)
    {
        System.out.println("browser passed  as :"  + browser);
    }

    @Parameters({"userName","password"})
    @Test
    public void two(String userName,String password)
    {
        System.out.println("browser username passed  as :"  + userName);
        System.out.println("browser password passed  as :"  + password);
    }
}
