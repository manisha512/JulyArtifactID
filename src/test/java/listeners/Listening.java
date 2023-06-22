package listeners;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	public class Listening implements ITestListener{


		public void onTestStart(ITestResult result) {
			System.out.println("[Hureyy... Test Case Started] " + result.getName());		
		}

		public void onTestSuccess(ITestResult result) {
			System.out.println("[Hureyy... Test Case Pas zali Re Kashi Trai] "+ result.getName());		
		}

		public void onTestFailure(ITestResult result) {
			System.out.println("[Ohh Shit !! Baba  Test Case Fail Zali na] " + result.getName());		
		}

		public void onTestSkipped(ITestResult result) {
			System.out.println("[Arrr... Test Case Skipped] " + result.getName());		
		}
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

		public void onStart(ITestContext context) {
			System.out.println("[Testing Start Zali Re Ban Lav] " + context.getName());		
		}

		public void onFinish(ITestContext context) {
			System.out.println("[Testing Stop Zali Re Band Kar] "+ context.getName());		

}}

		