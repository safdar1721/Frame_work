package Listener_Testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc is started");
	}
//tc is pass
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc is passed");
	}
//tcis fail
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc is skipped");
	}
	
	
	

	
	

}
