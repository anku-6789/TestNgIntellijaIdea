package ExecutionOrder;

import org.testng.annotations.*;

public class AnnotatiosTest {

    @BeforeMethod
    public void beforemethod() {
        System.out.println("i am before method  guys");
    }

    @AfterMethod
    public void aftermethod() {
        System.out.println("i am after method  guys");}

        @BeforeClass
        public void beforeclass() {
            System.out.println("i am before all the classes");}

    @AfterClass
    public void afterclass() {
        System.out.println("i am before all the classes");}

        @Test
    public void test() {
            System.out.println("i am the mai test header");
        }
}
