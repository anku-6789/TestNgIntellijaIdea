package paramertization;

import org.testng.annotations.Test;

public class dataproviderwithitest {

@Test(dataProvider = "Scenariotype",dataProviderClass= dataprovidersource.class )
    public void scenario1(String scenariodata)
{
    System.out.println("testing secenario("+scenariodata+")");
}
    @Test
    public void scenario2(String scenariodata) {
        System.out.println("testing secenario(" + scenariodata + ")");
    }
        @Test
        public void scenario3 (String scenariodata)
        {
            System.out.println("testing secenario(" + scenariodata + ")");
        }

}