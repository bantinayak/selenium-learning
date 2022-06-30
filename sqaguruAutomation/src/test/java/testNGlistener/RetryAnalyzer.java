package testNGlistener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int retryCounter = 0;
	int retryMaxLimit = 2;

	//@Override
	public boolean retry(ITestResult result) {
		if (retryCounter < retryMaxLimit) {
			retryCounter++;
			return true;

		} else {
			return false;
		}
	}
}
