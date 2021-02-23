package paramertization;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import javax.naming.Context;

public class dataprovidersource {

    @DataProvider(name = "Scenariotype")
    public static Object[][] gettypdata(ITestContext Context) {
        String testname = Context.getName();
        if ("scenario1".equals(testname)) {
            return new Object[][]{{"scenario 1type data"}};
        } else if ("scenario2".equals(testname)) {
            return new Object[][]{{"scenario 2 type data"}};
        } else {
            return new Object[][]{{"commmo scenaarios"}};
        }

    }
    }
