package testngGrouping;

	import org.testng.annotations.Test;

	@Test (groups = {"AllLovelyTestCases"})
	public class TestNGRegularExpression {
		
		
		// Us123
		@Test(groups = {"chrome.Sanity"})
		public void w11() {
			System.out.println("W11 is Running");
		}

		@Test(groups = {"firefox.Sanity"})
		public void w12() {
			System.out.println("W12 is Running");
		//	Assert.fail();
		}
		@Test(groups = {"chrome.smoke"})
		public void w13() {
			System.out.println("W13 is Running");
			//Assert.fail();
		}
		@Test(groups = {"firefox.regression"})
		public void w14() {
			System.out.println("W14 is Running");
		}
		@Test(groups = {"firefox.smoke"})
		public void w15() {
			System.out.println("W15 is Running");
		}
}
