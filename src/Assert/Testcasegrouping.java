package Assert;

import org.testng.annotations.Test;

public class Testcasegrouping {

    @Test(groups="Regression")
    public void testone(){
        System.out.println("I am in test one and performinng regression");
    }

    @Test(groups="smoke")
    public void testtwo(){
        System.out.println("I am in test second and performinng smoke");
    }

    @Test(groups="Sanity")
    public void testhree(){
        System.out.println("I am in test third  and performinng sannity");
    }

    @Test(groups={"Regression","Sanity"})
    public void testfour(){
        System.out.println("I am in test one and performinng regression ad sanity  togerther");
    }


}
