package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class demolistner implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("on test strating its printing");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("on test sucess its printitnng"+iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("on test failure its printing"+iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("on test skipped its printing"+iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
