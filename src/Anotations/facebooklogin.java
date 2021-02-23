package Anotations;

import org.testng.annotations.Test;

public class facebooklogin {



    @Test
    public void loginwithvalidcredetials()
    {
        System.out.println("i  am sucessfully login");
    }
    @Test
    public void loginwithinvalidcredetials()
    {
        System.out.println("i  am  unable to sucessfully login");
    }
}



