package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("success");
    }


    public void onTestFailure(ITestResult iTestResult) {
        ITestContext context = iTestResult.getTestContext();
        System.out.println("Failure");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("percentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("start");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("finish");
    }
}
