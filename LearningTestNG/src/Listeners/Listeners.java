package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

    public void onTestSuccess(ITestResult tr){

        System.out.println("Test passed.");

    }

    public void onTestFailure(ITestResult tr){

        System.out.println("Test failed.");

    }

}
